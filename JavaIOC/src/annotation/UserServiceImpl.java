package annotation;

@Component(id = "userService")
public class UserServiceImpl {

	private UserDaoImpl userDao;
	private User1DaoImpl user1Dao;

	// �ֶ��ϵ�ע��,��������name����
	@Autowired
	public User2DaoImpl user2Dao;

	// set�����ϵ�ע�⣬����name����
	@Autowired(name = "userDao")
	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	// set�����ϵ�ע�⣬û������name����
	@Autowired
	public void setUser1Dao(User1DaoImpl user1Dao) {
		this.user1Dao = user1Dao;
	}

	public void show() {
		userDao.show();
		user1Dao.show1();
		user2Dao.show2();
		System.out.println("������Service����........");
	}
}
