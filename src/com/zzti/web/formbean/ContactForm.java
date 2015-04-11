package com.zzti.web.formbean;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.zzti.utils.RegexUtil;
import com.zzti.utils.StringUtils;

public class ContactForm {

	public ContactForm() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private int cid;
	private String cname;
	private String phone;
	private String email;
	private String living;
	private String company;
	private String remark;
	private Map<String, String> errors = new HashMap<String, String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLiving() {
		return living;
	}

	public void setLiving(String living) {
		this.living = living;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	/**
	 * ��֤��
	 * 
	 * @return
	 */
	public boolean validate() {
		boolean flag = true;
		// ��֤����
		if (this.name == null || this.name.trim().equals("")) {
			flag = false;
			this.errors.put("name", "��������Ϊ��!");
		}
		// ��֤�༶
		if (this.cid == 0) {
			flag = false;
			this.errors.put("cid", "��ѡ��༶!");
		}
		// ��֤�ֻ���
		if (this.phone == null || this.phone.trim().equals("")) {
			flag = false;
			this.errors.put("phone", "�ֻ��Ų���Ϊ��!");
		} else// ��֤�ֻ����Ƿ���ȷ
		{
			if (!RegexUtil.isPhone(this.phone)) {
				flag = false;
				this.errors.put("phone", "��������ȷ���ֻ�����!");
			}
		}
		// ��֤���䣨�ɿգ�
		if (this.email != null && !this.email.trim().equals("")) {
			if (!RegexUtil.isEmail(this.email)) {
				flag = false;
				this.errors.put("email", "��������ȷ�������ַ!");
			}
		}

		return flag;
	}
}
