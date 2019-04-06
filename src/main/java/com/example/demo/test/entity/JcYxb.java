package com.example.demo.test.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 基础_院系表
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-06
 */
@Data
@Accessors(chain = true)
@TableName("JC_YXB")
public class JcYxb extends Model<JcYxb> {

    private static final long serialVersionUID = 1L;

    @TableId("YXID")
    private Double yxid;

    @TableField("YXMC")
    private String yxmc;

    @TableField("SJYX")
    private String sjyx;

    @TableField("SSXQ")
    private Double ssxq;

    @TableField("SFKY")
    private String sfky;

    @TableField("BZ")
    private String bz;

    @TableField("YXDM")
    private String yxdm;


    @Override
    protected Serializable pkVal() {
        return this.yxid;
    }

}
