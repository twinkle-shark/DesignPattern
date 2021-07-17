import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import com.baizhi.util.SqlSessionUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        User user=new User(0,"李四",new Date(2000,1,1),"男","长江大学");
        System.out.println(user);
        SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).add(user);
        System.out.println(user);
        SqlSessionUtil.commit();
        SqlSessionUtil.release();
    }
    @Test
    public void user_add1() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2021-10-21");
        User user=new User(0,"李四",new Date(2000,1,1),"男","长江大学");
        System.out.println(user);
        SqlSessionUtil.getSqlSession().getMapper(UserMapper.class).add1(user);
        System.out.println(user);
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
    @Test
    public void search_sql(){
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("五");
        user.setSex("女");
        user.setAddress("北京");
        List<User> allUser=userMapper.findAnimateSql(user);
        for(User user1:allUser){
            System.out.println(user1);
        }

    }
    @Test
    public void update_sql(){
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        User user=new User();
        user.setId(7);
        user.setUsername("李四");
        user.setSex("男");
        user.setAddress("北京");
        userMapper.update(user);
        List<User> allUser=userMapper.findAnimateSql(user);
        for(User user1:allUser){
            System.out.println(user1);
        }

    }
    @Test
    public void findManyId_sql(){
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<User> allUser=userMapper.findManyId(list);
        for(User user1:allUser){
            System.out.println(user1);
        }

    }
    @Test
    public void findManyId1_sql() {
        UserMapper userMapper = SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        Integer[] ids = {1, 2, 3};
        List<User> allUser = userMapper.findManyId1(ids);
        for (User user1 : allUser) {
            System.out.println(user1);
        }
    }




}
