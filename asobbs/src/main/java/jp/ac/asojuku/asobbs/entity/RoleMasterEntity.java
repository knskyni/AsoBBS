package jp.ac.asojuku.asobbs.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 役割マスタ モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity 
@Table(name="ROLE_MASTER")
public class RoleMasterEntity implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ROLE_ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	/** 役割名. */
	private String roleName;


	/**
	 * コンストラクタ.
	 */
	public RoleMasterEntity() {
	}

	/**
	 * ROLE_ID を設定します.
	 * 
	 * @param roleId
	 *            ROLE_ID
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * ROLE_ID を取得します.
	 * 
	 * @return ROLE_ID
	 */
	public Integer getRoleId() {
		return this.roleId;
	}

	/**
	 * 役割名 を設定します.
	 * 
	 * @param roleName
	 *            役割名
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 役割名 を取得します.
	 * 
	 * @return 役割名
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
		RoleMasterEntity other = (RoleMasterEntity) obj;
		if (roleId == null) {
			if (other.roleId != null) {
				return false;
			}
		} else if (!roleId.equals(other.roleId)) {
			return false;
		}
		return true;
	}

}
