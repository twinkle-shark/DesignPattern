import com.baizhi.entity.User;
import com.baizhi.entity.Role;
import com.baizhi.entity.Orders;
import com.baizhi.mapper.OrdersMapper;
import com.baizhi.mapper.RoleMapper;
import com.baizhi.mapper.UserMapper;
import com.baizhi.util.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestTask {
    @Test
    public void search(){
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        PageHelper.startPage(2,2);
        List<User> allUser=userMapper.findAllUser();
        for (int i=0;i<allUser.size();i++){
            System.out.println(allUser.get(i));
        }
        PageInfo<User> pageInfo=new PageInfo<>(allUser);
        System.out.println("总条数"+pageInfo.getTotal());
        System.out.println("当前是第几页"+ pageInfo.getPageNum());
        System.out.println("当前是不是第一页"+pageInfo.isIsFirstPage());
        System.out.println("当前是不是最后一页"+pageInfo.isIsLastPage());
        System.out.println("当前总页"+pageInfo.getPages());
    }
    @Test
    public void search_1_1(){
        OrdersMapper ordersMapper= SqlSessionUtil.getSqlSession().getMapper(OrdersMapper.class);
        List<Orders> orders =ordersMapper.findAllOrdersAndUser();
        for(Orders order:orders){
            System.out.println(order);
        }
    }
    @Test
    public void search_1_n(){
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        List<User> users =userMapper.findAllUserAndOrders();
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void search_n_n(){
        RoleMapper roleMapper= SqlSessionUtil.getSqlSession().getMapper(RoleMapper.class);
        List<Role> roles =roleMapper.findAllRoleAndUser();
        for(Role role:roles){
            System.out.println(role);
        }
    }
    @Test
    public void search_n_n_task(){
        /*查询所有用户对应的所有角色 findAllUserAndRole*/
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        List<User> users =userMapper.findAllUserAndRole();
        for(User user:users){
            System.out.println(user);
        }
    }
    @Test
    public void search_n_n_task1(){
        /*根据userid查询所有的角色 findUserByIdAndRole*/
        UserMapper userMapper= SqlSessionUtil.getSqlSession().getMapper(UserMapper.class);
        List<User> users =userMapper.findUserByIdAndRole(1);
        for(User user:users){
            System.out.println(user);
        }
    }
    /**
     * 查询所有用户对应的所有角色 findAllUserAndRole
     * 根据userid查询所有的角色 findUserByIdAndRole
     * 根据用户id查询对应所有订单 findOrdersByUserId
     * 根据订单id查询用户的信息
     * 根据角色id查询对应的用户信息
     */

}
