package com.zzti.business;

import com.zzti.service.Contact;
import com.zzti.service.ContactSEI;
import com.zzti.service.ListResult;
import com.zzti.service.Result;
import com.zzti.service.TResult;

public class ContactBusiness {
	private ContactSEI service = Common.getInstace().getService();
	public ContactBusiness() {
	}
	/**
	 * �����ϵ��
	 * @param data
	 * @return
	 */
	public Result add(Contact data)
	{
		return service.contactAdd(data);
	}
	/**
	 * �޸���ϵ��
	 * @param data
	 * @return
	 */
	public Result update (Contact data)
	{
		return service.contactUpdate(data);
	}
	/**
	 * ɾ����ϵ��
	 * @param data
	 * @return
	 */
	public Result delete(Contact data)
	{
		return service.contactDelete(data);
	}
	/**
	 * ��ȡ��ϵ�˶���
	 * @param data
	 * @return
	 */
	public TResult<Contact> getModel(Contact data)
	{
		return service.contactGetModel(data);
	}
	/**
	 * ��ȡ��ϵ���б� 
	 * @param data
	 * @return
	 */
	public ListResult<Contact> getList(Contact data)
	{
		return service.contactGetList(data);
	}

}
