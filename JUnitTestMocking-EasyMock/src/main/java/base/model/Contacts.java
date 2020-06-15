package base.model;

public class Contacts {
	private Integer cid;
	private String cname;
	private String caddr;
	public Contacts() {
		super();
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	@Override
	public String toString() {
		return "Contacts [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + "]";
	}
}
