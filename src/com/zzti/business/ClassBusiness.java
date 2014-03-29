package com.zzti.business;

import com.zzti.service.ContactSEI;
import com.zzti.service.ListResult;
import com.zzti.service.Result;
import com.zzti.service.TResult;

public class ClassBusiness {
	private ContactSEI service = Common.getInstace().getService();
	
	/**
	 * ��Ӱ༶����
	 * @param data
	 * @return
	 */
	public Result add(com.zzti.service.Class data)
	{
		return service.classAdd(data);
	}
	/**
	 * �޸İ༶����
	 * @param data
	 * @return
	 */
	public Result update(com.zzti.service.Class data)
	{
		return service.classUpdate(data);
	}
	/**
	 * ɾ���༶����
	 * @param data
	 * @return
	 */
	public Result delete(com.zzti.service.Class data)
	{
		return service.classDelete(data);
	}
	/**
	 * ��ȡ�༶����
	 * @param data
	 * @return
	 */
	public TResult<com.zzti.service.Class> getModel(com.zzti.service.Class data)
	{
		return service.classGetModel(data);
	}
	/**
	 * ��ȡ�༶�����б�
	 * @return
	 */
	public ListResult<com.zzti.service.Class> getList()
	{
		return service.classGetList();
	}
}
