/*
 * Copyright (C) 2023 Beijing Huaxia Chunsong Technology Co., Ltd. 
 * <https://www.chatopera.com>, Licensed under the Chunsong Public 
 * License, Version 1.0  (the "License"), https://docs.cskefu.com/licenses/v1.html
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Copyright (C) 2018- Jun. 2023 Chatopera Inc, <https://www.chatopera.com>,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2017 优客服-多渠道客服系统,  Licensed under the Apache License, Version 2.0, 
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package com.cskefu.cc.model;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cs_passport_wechat_user")
@org.hibernate.annotations.Proxy(lazy = false)
public class PassportWechatUser implements java.io.Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6821800713170747957L;
    private String id;
    private String snsid;

    private boolean subscribe;
    private String openid;
    private String nickname;
    private String sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headimgurl;
    private String subscribetime;
    private String unionid;
    private int sexid;
    private String remark;
    private int groupid;

    private String contactsid;

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSnsid() {
        return snsid;
    }

    public void setSnsid(String snsid) {
        this.snsid = snsid;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getSubscribetime() {
        return subscribetime;
    }

    public void setSubscribetime(String subscribetime) {
        this.subscribetime = subscribetime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public int getSexid() {
        return sexid;
    }

    public void setSexid(int sexid) {
        this.sexid = sexid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Transient
    public Date getSubTime() {
        Date date = new Date();
        if (!StringUtils.isBlank(this.subscribetime)) {
            long time = Long.parseLong(this.subscribetime);
            date = new Date(time * 1000);
        }
        return date;
    }

    public String getContactsid() {
        return contactsid;
    }

    public void setContactsid(String contactsid) {
        this.contactsid = contactsid;
    }
}
