package jp.ac.asojuku.asobbs.param;

public enum RoleId {

	STUDENT(0,"学生"),
	TEACHER(1,"先生"),
	MANAGER(2,"管理者");

	//ステータス
	private int id;
	private String msg;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return msg1
	 */
	public String getMsg() {
		return msg;
	}


	private RoleId(int id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	public boolean equals(Integer id){
		if(id == null){
			return false;
		}

		return (this.id == id);
	}

	public static RoleId search(Integer id){
		RoleId role = null;
		if( STUDENT.equals(id)){
			role = STUDENT;
		}else if( TEACHER.equals(id)){
			role = TEACHER;
		}else if( MANAGER.equals(id)){
			role = MANAGER;
		}

		return role;
	}

	public static boolean check(int id){
		boolean ret = false;

		if( STUDENT.equals(id)){
			ret = true;
		}else if( TEACHER.equals(id)){
			ret = true;
		}else if( MANAGER.equals(id)){
			ret = true;
		}

		return ret;
	}
	
}
