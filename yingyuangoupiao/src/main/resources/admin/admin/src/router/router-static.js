import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
    // 解决多次点击左侧菜单报错问题
    const VueRouterPush = VueRouter.prototype.push
    VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
    }
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import beifen from '@/views/modules/databaseBackup/beifen'
import huanyuan from '@/views/modules/databaseBackup/huanyuan'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import dianying from '@/views/modules/dianying/list'
    import dianyingCollection from '@/views/modules/dianyingCollection/list'
    import dianyingCommentback from '@/views/modules/dianyingCommentback/list'
    import dianyingOrder from '@/views/modules/dianyingOrder/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import huodong from '@/views/modules/huodong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryChangci from '@/views/modules/dictionaryChangci/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryDianying from '@/views/modules/dictionaryDianying/list'
    import dictionaryDianyingCollection from '@/views/modules/dictionaryDianyingCollection/list'
    import dictionaryDianyingOrder from '@/views/modules/dictionaryDianyingOrder/list'
    import dictionaryDianyingOrderPayment from '@/views/modules/dictionaryDianyingOrderPayment/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryHuiyuandengji from '@/views/modules/dictionaryHuiyuandengji/list'
    import dictionaryHuodong from '@/views/modules/dictionaryHuodong/list'
    import dictionaryJinyong from '@/views/modules/dictionaryJinyong/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }, {
        path: '/huanyuan',
        name: '数据还原',
        component: huanyuan
    }, {
        path: '/beifen',
        name: '数据备份',
        component: beifen
    }, {
        path: '/users',
        name: '管理信息',
        component: users
    }
    ,{
        path: '/dictionaryChangci',
        name: '场次',
        component: dictionaryChangci
    }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryDianying',
        name: '电影类型',
        component: dictionaryDianying
    }
    ,{
        path: '/dictionaryDianyingCollection',
        name: '收藏表类型',
        component: dictionaryDianyingCollection
    }
    ,{
        path: '/dictionaryDianyingOrder',
        name: '订单类型',
        component: dictionaryDianyingOrder
    }
    ,{
        path: '/dictionaryDianyingOrderPayment',
        name: '订单支付类型',
        component: dictionaryDianyingOrderPayment
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryHuiyuandengji',
        name: '会员等级类型',
        component: dictionaryHuiyuandengji
    }
    ,{
        path: '/dictionaryHuodong',
        name: '活动类型',
        component: dictionaryHuodong
    }
    ,{
        path: '/dictionaryJinyong',
        name: '账户状态',
        component: dictionaryJinyong
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '客服反馈',
        component: chat
      }
    ,{
        path: '/dianying',
        name: '电影',
        component: dianying
      }
    ,{
        path: '/dianyingCollection',
        name: '电影收藏',
        component: dianyingCollection
      }
    ,{
        path: '/dianyingCommentback',
        name: '电影评价',
        component: dianyingCommentback
      }
    ,{
        path: '/dianyingOrder',
        name: '电影订单',
        component: dianyingOrder
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/huodong',
        name: '活动信息',
        component: huodong
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
