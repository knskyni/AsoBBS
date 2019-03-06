package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

/**
 * ルームテーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Data
@Entity 
@Table(name="ROOM_TBL")
public class RoomTblEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ルームID. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;

	/** 名前. */
	private String name;

	/** 作成日時. */
	private Date createDate;

	/** ユーザーテーブル. */
	@OneToOne
    @JoinColumn(name="CREATE_USER_ID",insertable=true ,updatable=true)
    //@Column(name="CREATE_USER_ID")
	private UserTblEntity createUserId;
	//Integer createUserId;

	/** 更新日時. */
	private Date updateDate;

	/** ユーザーテーブル. */
	@OneToOne
    @JoinColumn(name="UPDATE_USER_ID",insertable=true ,updatable=true)
    //@Column(name="UPDATE_USER_ID")
	private UserTblEntity updateUserId;
	//Integer updateUserId;

	/** カテゴリテーブル 一覧. */
	@OneToMany
	@JoinColumn(name="roomId",insertable=true ,updatable=true)
	private Set<CategoryTblEntity> categoryTblSet;

//	/** ルームユーザーテーブル 一覧. */
	@OneToMany
	//@JoinColumns({
	//	@JoinColumn(name = "roomId", referencedColumnName = "roomId"),
	//	@JoinColumn(name = "userId", referencedColumnName = "userId")
	//})
	//@Fetch(FetchMode.SUBSELECT)
	@JoinColumn(name="roomId",insertable=true ,updatable=true)
	private Set<RoomUserTblEntity> roomUserTblSet;
	

	/** 全員フラグ. */
	private Integer allFlg;

	/**
	 * コンストラクタ.
	 */
	public RoomTblEntity() {
		this.categoryTblSet = new HashSet<CategoryTblEntity>();
		this.roomUserTblSet = new HashSet<RoomUserTblEntity>();
	}


	@PrePersist
    public void onPrePersist() {
		setCreateDate(new Date());
		setUpdateDate(new Date());
    }

    @PreUpdate
    public void onPreUpdate() {
    	setUpdateDate(new Date());
    }
    
//	/**
//	 * ルームユーザーテーブル 一覧を設定します.
//	 * 
//	 * @param roomUserTblSet
//	 *            ルームユーザーテーブル 一覧
//	 */
//	public void setRoomUserTblSet(Set<RoomUserTblEntity> roomUserTblSet) {
//		this.roomUserTblSet = roomUserTblSet;
//	}
//
//	/**
//	 * ルームユーザーテーブル を追加します.
//	 * 
//	 * @param roomUserTbl
//	 *            ルームユーザーテーブル
//	 */
//	public void addRoomUserTbl(RoomUserTblEntity roomUserTbl) {
//		this.roomUserTblSet.add(roomUserTbl);
//	}
//
//	/**
//	 * ルームユーザーテーブル 一覧を取得します.
//	 * 
//	 * @return ルームユーザーテーブル 一覧
//	 */
//	public Set<RoomUserTblEntity> getRoomUserTblSet() {
//		return this.roomUserTblSet;
//	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RoomTblEntity other = (RoomTblEntity) obj;
		if (roomId == null) {
			if (other.roomId != null) {
				return false;
			}
		} else if (!roomId.equals(other.roomId)) {
			return false;
		}
		return true;
	}

}
