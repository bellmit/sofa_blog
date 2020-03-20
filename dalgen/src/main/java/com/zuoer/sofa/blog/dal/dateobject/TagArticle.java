package com.zuoer.sofa.blog.dal.dateobject;

import java.util.Date;

public class TagArticle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG_ARTICLE.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG_ARTICLE.TAG_ID
     *
     * @mbg.generated
     */
    private Long tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG_ARTICLE.ARTICLE_ID
     *
     * @mbg.generated
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG_ARTICLE.GMT_CREATE
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAG_ARTICLE.GMT_MODIFIED
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG_ARTICLE.ID
     *
     * @return the value of TAG_ARTICLE.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG_ARTICLE.ID
     *
     * @param id the value for TAG_ARTICLE.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG_ARTICLE.TAG_ID
     *
     * @return the value of TAG_ARTICLE.TAG_ID
     *
     * @mbg.generated
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG_ARTICLE.TAG_ID
     *
     * @param tagId the value for TAG_ARTICLE.TAG_ID
     *
     * @mbg.generated
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG_ARTICLE.ARTICLE_ID
     *
     * @return the value of TAG_ARTICLE.ARTICLE_ID
     *
     * @mbg.generated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG_ARTICLE.ARTICLE_ID
     *
     * @param articleId the value for TAG_ARTICLE.ARTICLE_ID
     *
     * @mbg.generated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG_ARTICLE.GMT_CREATE
     *
     * @return the value of TAG_ARTICLE.GMT_CREATE
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG_ARTICLE.GMT_CREATE
     *
     * @param gmtCreate the value for TAG_ARTICLE.GMT_CREATE
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAG_ARTICLE.GMT_MODIFIED
     *
     * @return the value of TAG_ARTICLE.GMT_MODIFIED
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAG_ARTICLE.GMT_MODIFIED
     *
     * @param gmtModified the value for TAG_ARTICLE.GMT_MODIFIED
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}