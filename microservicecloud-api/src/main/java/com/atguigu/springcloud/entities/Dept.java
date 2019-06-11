package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable// entity --orm--- db_table
{
	private static final long serialVersionUID = -6522484042407631696L;
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	private Integer id;
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}
	
	
}

/**
 *
 *
 *
 *
 * http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/00137396287703354d8c6c01c904c7d9ff056ae23da865a000
 *
 * 　　http://blog.csdn.net/zongzhankui/article/details/46341967
 *
 9.提交修改文件到GitHub

 　　新增文件（红色），右键-->Git-->add，将新增的文件加入本地仓库，此时文件变绿色

 　　修改文件（蓝色）

 　　在项目右键-->Git-->Commit Directory，查看有变动的文件并输入Commit Message，点击Commit and Push...

 　　提交后会进行语法检查，若存在错误或警告会给出确认提示，点击Commit，弹出Push框，点击Push，上传GitHub成功
 **/