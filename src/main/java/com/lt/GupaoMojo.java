package com.lt;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @Author LT
 * @create 2021-05-07 17:06
 */
@Mojo(name = "longtao",defaultPhase = LifecyclePhase.PACKAGE)
public class GupaoMojo extends AbstractMojo {

    @Parameter
    private String msg;
    @Parameter
    private List<String> options;
/*
*  mvn clean install   装载
*   mvn help:system  查看系统参数
* */
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("龙滔 骨架测试-longtao1"+msg);
        System.out.println("龙滔 骨架测试-longtao2"+options);
    }
}
