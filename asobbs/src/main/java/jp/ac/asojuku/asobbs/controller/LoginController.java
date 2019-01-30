package jp.ac.asojuku.asobbs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.asojuku.asobbs.config.MessageProperty;
import jp.ac.asojuku.asobbs.dto.LoginInfoDto;
import jp.ac.asojuku.asobbs.exception.AsoBbsSystemErrException;
import jp.ac.asojuku.asobbs.param.SessionConst;
import jp.ac.asojuku.asobbs.service.LoginService;

/**
 * ログイン関連のコントローラー
 * @author nishino
 *
 */
@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value= {"/","/login"}, method=RequestMethod.GET)
    public ModelAndView login(@ModelAttribute("msg")String msg,ModelAndView mv) {
		
        mv.setViewName("login");
        
        //エラーメッセージがあればメッセージを仕込んでおく
        if( msg != null && msg.length() > 0) {
        	mv.addObject("msg", msg);
        }else {
        	mv.addObject("msg", "");
        }
        return mv;
    }

	/**
	 * @param redirectAttributes
	 * @param mail
	 * @param password
	 * @param mv
	 * @return
	 */
	@RequestMapping(value= {"/auth"}, method=RequestMethod.POST)
	public String auth(
			RedirectAttributes redirectAttributes,
			@RequestParam("mail")String mail, 
    		@RequestParam("password")String password,
    		ModelAndView mv
			) {

		String url;
		//login
		LoginInfoDto loginInfo = null;
		try {
			//ログイン処理を行う
			loginInfo = loginService.login(mail,password);
			if( loginInfo != null) {
				//セッションにログイン情報を保存
				session.setAttribute(SessionConst.LOGININFO,loginInfo);
				url = "redirect:dashboad";
			}else {
				url = fowardLoginError(redirectAttributes);
			}
		} catch (AsoBbsSystemErrException e) {
			e.printStackTrace();
			url = "redirect:login";
		}
		
        return url;
	}

	/**
	 * ログアウト処理
	 * @param redirectAttributes
	 * @return
	 * @throws AsoBbsSystemErrException
	 */
	@RequestMapping(value= {"/logout"}, method=RequestMethod.GET)
	public String logout(RedirectAttributes redirectAttributes) throws AsoBbsSystemErrException {
		//ログアウトメッセージを取得
		String errMsg = MessageProperty.getInstance().getProperty(MessageProperty.LOGOUT_MSG);
		//エラーメッセージをセット
		redirectAttributes.addFlashAttribute("msg", errMsg);
				
		//セッション破棄
		session.invalidate();
		
		//ログイン画面へリダイレクト
		return "redirect:login";
	}
	
	/**
	 * ログインエラー時の処理
	 * 
	 * @param redirectAttributes
	 * @return
	 * @throws AsoBbsSystemErrException
	 */
	private String fowardLoginError(RedirectAttributes redirectAttributes) throws AsoBbsSystemErrException {
		//エラーメッセージを取得
		String errMsg = MessageProperty.getInstance().getProperty(MessageProperty.LOGIN_ERR_LOGINERR);
		//エラーメッセージをセット
		redirectAttributes.addFlashAttribute("msg", errMsg);
		
		return "redirect:login";
	}
}