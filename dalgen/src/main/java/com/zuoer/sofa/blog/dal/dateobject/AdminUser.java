package com.zuoer.sofa.blog.dal.dateobject;

import java.util.Date;

public class AdminUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.USERNAME
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.BIRTH_DATE
     *
     * @mbg.generated
     */
    private Date birthDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.NICKNAME
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.GITHUB
     *
     * @mbg.generated
     */
    private String github;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.QQ
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.WECAHT
     *
     * @mbg.generated
     */
    private String wecaht;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.AVATAR
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.GMT_CREATE
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.GMT_MODIFIED
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.HOBBY
     *
     * @mbg.generated
     */
    private String hobby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.MOTTO
     *
     * @mbg.generated
     */
    private String motto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADMIN_USER.MD_INFO
     *
     * @mbg.generated
     */
    private String mdInfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.ID
     *
     * @return the value of ADMIN_USER.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.ID
     *
     * @param id the value for ADMIN_USER.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.USERNAME
     *
     * @return the value of ADMIN_USER.USERNAME
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.USERNAME
     *
     * @param username the value for ADMIN_USER.USERNAME
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.PASSWORD
     *
     * @return the value of ADMIN_USER.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.PASSWORD
     *
     * @param password the value for ADMIN_USER.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.BIRTH_DATE
     *
     * @return the value of ADMIN_USER.BIRTH_DATE
     *
     * @mbg.generated
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.BIRTH_DATE
     *
     * @param birthDate the value for ADMIN_USER.BIRTH_DATE
     *
     * @mbg.generated
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.NICKNAME
     *
     * @return the value of ADMIN_USER.NICKNAME
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.NICKNAME
     *
     * @param nickname the value for ADMIN_USER.NICKNAME
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.EMAIL
     *
     * @return the value of ADMIN_USER.EMAIL
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.EMAIL
     *
     * @param email the value for ADMIN_USER.EMAIL
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.GITHUB
     *
     * @return the value of ADMIN_USER.GITHUB
     *
     * @mbg.generated
     */
    public String getGithub() {
        return github;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.GITHUB
     *
     * @param github the value for ADMIN_USER.GITHUB
     *
     * @mbg.generated
     */
    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.QQ
     *
     * @return the value of ADMIN_USER.QQ
     *
     * @mbg.generated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.QQ
     *
     * @param qq the value for ADMIN_USER.QQ
     *
     * @mbg.generated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.WECAHT
     *
     * @return the value of ADMIN_USER.WECAHT
     *
     * @mbg.generated
     */
    public String getWecaht() {
        return wecaht;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.WECAHT
     *
     * @param wecaht the value for ADMIN_USER.WECAHT
     *
     * @mbg.generated
     */
    public void setWecaht(String wecaht) {
        this.wecaht = wecaht == null ? null : wecaht.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.AVATAR
     *
     * @return the value of ADMIN_USER.AVATAR
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.AVATAR
     *
     * @param avatar the value for ADMIN_USER.AVATAR
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.GMT_CREATE
     *
     * @return the value of ADMIN_USER.GMT_CREATE
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.GMT_CREATE
     *
     * @param gmtCreate the value for ADMIN_USER.GMT_CREATE
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.GMT_MODIFIED
     *
     * @return the value of ADMIN_USER.GMT_MODIFIED
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.GMT_MODIFIED
     *
     * @param gmtModified the value for ADMIN_USER.GMT_MODIFIED
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.HOBBY
     *
     * @return the value of ADMIN_USER.HOBBY
     *
     * @mbg.generated
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.HOBBY
     *
     * @param hobby the value for ADMIN_USER.HOBBY
     *
     * @mbg.generated
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.MOTTO
     *
     * @return the value of ADMIN_USER.MOTTO
     *
     * @mbg.generated
     */
    public String getMotto() {
        return motto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.MOTTO
     *
     * @param motto the value for ADMIN_USER.MOTTO
     *
     * @mbg.generated
     */
    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADMIN_USER.MD_INFO
     *
     * @return the value of ADMIN_USER.MD_INFO
     *
     * @mbg.generated
     */
    public String getMdInfo() {
        return mdInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADMIN_USER.MD_INFO
     *
     * @param mdInfo the value for ADMIN_USER.MD_INFO
     *
     * @mbg.generated
     */
    public void setMdInfo(String mdInfo) {
        this.mdInfo = mdInfo == null ? null : mdInfo.trim();
    }
}