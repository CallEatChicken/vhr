package org.sang.bean;

import java.util.Date;

public class CompanyData {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.title
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.folder_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private String folderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.staff_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private Integer staffId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.size
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private Integer size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_data.create_time
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.id
     *
     * @return the value of company_data.id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.id
     *
     * @param id the value for company_data.id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.title
     *
     * @return the value of company_data.title
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.title
     *
     * @param title the value for company_data.title
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.folder_id
     *
     * @return the value of company_data.folder_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.folder_id
     *
     * @param folderId the value for company_data.folder_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setFolderId(String folderId) {
        this.folderId = folderId == null ? null : folderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.staff_id
     *
     * @return the value of company_data.staff_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.staff_id
     *
     * @param staffId the value for company_data.staff_id
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.size
     *
     * @return the value of company_data.size
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.size
     *
     * @param size the value for company_data.size
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_data.create_time
     *
     * @return the value of company_data.create_time
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_data.create_time
     *
     * @param createTime the value for company_data.create_time
     *
     * @mbg.generated Wed Jun 05 16:32:28 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}