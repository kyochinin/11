package com.softusing.xuzhining.domain;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user2.id
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user2.email
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user2.password
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user2.phone
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user2.username
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user2
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user2.id
     *
     * @return the value of user2.id
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user2.id
     *
     * @param id the value for user2.id
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user2.email
     *
     * @return the value of user2.email
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user2.email
     *
     * @param email the value for user2.email
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user2.password
     *
     * @return the value of user2.password
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user2.password
     *
     * @param password the value for user2.password
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user2.phone
     *
     * @return the value of user2.phone
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user2.phone
     *
     * @param phone the value for user2.phone
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user2.username
     *
     * @return the value of user2.username
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user2.username
     *
     * @param username the value for user2.username
     *
     * @mbg.generated Fri May 19 10:25:24 JST 2023
     */
    public void setUsername(String username) {
        this.username = username;
    }
}