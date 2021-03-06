package com.chenlh.distributedlock.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table METHOD_LOCK
 */
public class MethodLock {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column METHOD_LOCK.ID
	 * @mbg.generated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column METHOD_LOCK.METHOD_NAME
	 * @mbg.generated
	 */
	private String methodName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column METHOD_LOCK.REMARK
	 * @mbg.generated
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column METHOD_LOCK.UPDATE_TIME
	 * @mbg.generated
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column METHOD_LOCK.ID
	 * @return  the value of METHOD_LOCK.ID
	 * @mbg.generated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column METHOD_LOCK.ID
	 * @param id  the value for METHOD_LOCK.ID
	 * @mbg.generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column METHOD_LOCK.METHOD_NAME
	 * @return  the value of METHOD_LOCK.METHOD_NAME
	 * @mbg.generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column METHOD_LOCK.METHOD_NAME
	 * @param methodName  the value for METHOD_LOCK.METHOD_NAME
	 * @mbg.generated
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column METHOD_LOCK.REMARK
	 * @return  the value of METHOD_LOCK.REMARK
	 * @mbg.generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column METHOD_LOCK.REMARK
	 * @param remark  the value for METHOD_LOCK.REMARK
	 * @mbg.generated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column METHOD_LOCK.UPDATE_TIME
	 * @return  the value of METHOD_LOCK.UPDATE_TIME
	 * @mbg.generated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column METHOD_LOCK.UPDATE_TIME
	 * @param updateTime  the value for METHOD_LOCK.UPDATE_TIME
	 * @mbg.generated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public MethodLock(Long id, String methodName, String remark, Date updateTime) {
		super();
		this.id = id;
		this.methodName = methodName;
		this.remark = remark;
		this.updateTime = updateTime;
	}
}