import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import com.baizhi.util.SqlSessionUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestTask {
    @Test
    public void search(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findAllUser();
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void search_username(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByName("张三");
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void search_id(){
        User user= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserById(1);
        System.out.println(user);
    }
    @Test
    public void search_dim(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByDim("%张%");
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void search_dim1(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByDim1("%张%");
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void user_add() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2021-10-21");

        SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).add(new User(0,"李四",new Date(2000,1,1),"男","长江大学"));
        SqlSessionUtil.commit();
        SqlSessionUtil.release();
    }
    @Test
    public void search_0(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByIdAndName(3,"李四");
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void search_1(){
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByIdAndName1(3,"李四");
        allUser.forEach( user->System.out.println(user));
    }
    @Test
    public void search_2(){
        User u=new User();
        u.setId(3);
        u.setUsername("李四");
        List<User> allUser= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).findUserByIdAndName2(u);
        allUser.forEach( user->System.out.println(user));
    }



}
