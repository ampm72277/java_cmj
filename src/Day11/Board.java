package Day11;


public class Board {
	/* �Խñ�(ī�� �Խñ�, ����, �������� ��)�� �ʿ��� ��������� �����ϼ���. 
	 * - �Խñ� ��ȣ, ����, ����, �ۼ���, ��Ͻð�, ��ȸ��, ���ƿ��, �Խñ� Ÿ��
	 * */
	private int num;
	private String title = "";
	private String contents = new String();
	private String writer ="";
	private String registerDate = "";
	private int views;
	private int like;
	private String type="";
	
	//�����ڸ� ��������.
	public Board(int num, String title, String contents, 
			String writer, String registerDate, String type) {
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.registerDate = registerDate;
		this.type = type;
	}
	/* ���	  : �Խñ� ���� ����ϴ� �޼ҵ� 
	 * �Ű����� : ����
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : print */
	public void print() {
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + title);
		System.out.println("�ۼ���: " + writer);
		System.out.println("��ȸ��: " + views);
		System.out.println("���ƿ�: " + like);
		System.out.println("�ۼ���: " + registerDate);
		System.out.println("���� : " + contents);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}