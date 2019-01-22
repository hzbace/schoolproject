package com.qfedu.tool.util;

import com.qfedu.tool.vo.PageVo;
import com.qfedu.tool.vo.ResultVo;

import java.util.List;

public class ResultUtil {
    public static ResultVo exec(Integer count, Object obj){
        ResultVo resultVo = new ResultVo();
        if(count > 0) {
            resultVo.setCode(1);
            resultVo.setMsg("操作成功");
            resultVo.setData(obj);
        }else {
            resultVo.setCode(0);
            resultVo.setMsg("操作失败");
        }
        return  resultVo;
    }

    public static  ResultVo ExecOk(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        return resultVo;
    }

    public static  ResultVo ExecOk(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        resultVo.setData(obj);
        return  resultVo;
    }

    public static ResultVo ExecOk(Object obj, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg(msg);
        resultVo.setData(obj);
        return resultVo;
    }

    public static ResultVo ExecError(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("ERROR");
        return  resultVo;
    }

    public static ResultVo ExecError(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg(msg);
        return  resultVo;
    }

    public static ResultVo ExecError(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("ERROR");
        resultVo.setData(obj);
        return  resultVo;
    }

    public static ResultVo ExecError(Object obj, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg(msg);
        resultVo.setData(obj);
        return  resultVo;
    }

    public static <T> PageVo<T> ExecPage(Integer page, Integer size, Integer count, List<T> data){
        PageVo pageVo = new PageVo();
        pageVo.setData(data);
        pageVo.setCurrpage(page);
        pageVo.setSize(size);
        pageVo.setCount(count);
        return  pageVo;
    }
}
