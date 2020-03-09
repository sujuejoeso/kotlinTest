package com.joeso.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //多路条件语句
        var ApiVersion=26;
        when(ApiVersion){
            26,27-> println("Android Oreo")
            24,25-> println("Android Nougat")
            23->println("Android Marshmallow")
            else->println("Android 5 or lower")
        }

        //for循环
       var names=arrayOf("John","Rose","ken" )
        for(i in 0..names.size-1){
            println("---- "+names[i])
        }

        for(name in names){
            println("---- "+name)
        }

        for((index,name) in names.withIndex())
            println("----- ${index}:${name}")

        //异常处理
        val value="f"
        var result:Int?=null

        try{
            result=Integer.parseInt(value)
        }catch(e:NumberFormatException){
            println("====Format "+e.message)
        }
        catch(e:Exception){
            println("====Common "+e.message)
        }finally {
            println("===="+result)
        }
        //异常处理 新语法
        var output=try{
            Integer.parseInt(value)
        }catch (e:Exception){
            -1
        }
        println("**** "+output)
    }


}
