(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yonghu/add-or-update"],{"13b1":function(e,n,t){"use strict";t.r(n);var r=t("9f93"),u=t("85db");for(var i in u)"default"!==i&&function(e){t.d(n,e,(function(){return u[e]}))}(i);t("32b4");var a,o=t("f0c5"),c=Object(o["a"])(u["default"],r["b"],r["c"],!1,null,"ba889176",null,!1,r["a"],a);n["default"]=c.exports},"32b4":function(e,n,t){"use strict";var r=t("5f2e"),u=t.n(r);u.a},"5f2e":function(e,n,t){},"85db":function(e,n,t){"use strict";t.r(n);var r=t("8cdf"),u=t.n(r);for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);n["default"]=u.a},"8cdf":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=u(t("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,r,u,i,a){try{var o=e[i](a),c=o.value}catch(s){return void t(s)}o.done?n(c):Promise.resolve(c).then(r,u)}function a(e){return function(){var n=this,t=arguments;return new Promise((function(r,u){var a=e.apply(n,t);function o(e){i(a,r,u,o,c,"next",e)}function c(e){i(a,r,u,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("a98e"))}.bind(null,t)).catch(t.oe)},c={data:function(){return{ruleForm:{yonghuming:"",mima:"",xingming:"",touxiang:"",xingbie:"",shouji:"",shenfenzheng:"",hunfou:""},xingbieOptions:[],xingbieIndex:0,hunfouOptions:[],hunfouIndex:0,user:{},ro:{yonghuming:!1,mima:!1,xingming:!1,touxiang:!1,xingbie:!1,shouji:!1,shenfenzheng:!1,hunfou:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return a(r.default.mark((function u(){var i,a,o,c;return r.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return i=e.getStorageSync("nowTable"),u.next=3,t.$api.session(i);case 3:if(a=u.sent,t.user=a.data,t.xingbieOptions="男,女".split(","),t.hunfouOptions="未婚,已婚".split(","),t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){u.next=15;break}return t.ruleForm.id=n.id,u.next=13,t.$api.info("yonghu",t.ruleForm.id);case 13:a=u.sent,t.ruleForm=a.data;case 15:if(!n.cross){u.next=54;break}o=e.getStorageSync("crossObj"),u.t0=r.default.keys(o);case 18:if((u.t1=u.t0()).done){u.next=54;break}if(c=u.t1.value,"yonghuming"!=c){u.next=24;break}return t.ruleForm.yonghuming=o[c],t.ro.yonghuming=!0,u.abrupt("continue",18);case 24:if("mima"!=c){u.next=28;break}return t.ruleForm.mima=o[c],t.ro.mima=!0,u.abrupt("continue",18);case 28:if("xingming"!=c){u.next=32;break}return t.ruleForm.xingming=o[c],t.ro.xingming=!0,u.abrupt("continue",18);case 32:if("touxiang"!=c){u.next=36;break}return t.ruleForm.touxiang=o[c],t.ro.touxiang=!0,u.abrupt("continue",18);case 36:if("xingbie"!=c){u.next=40;break}return t.ruleForm.xingbie=o[c],t.ro.xingbie=!0,u.abrupt("continue",18);case 40:if("shouji"!=c){u.next=44;break}return t.ruleForm.shouji=o[c],t.ro.shouji=!0,u.abrupt("continue",18);case 44:if("shenfenzheng"!=c){u.next=48;break}return t.ruleForm.shenfenzheng=o[c],t.ro.shenfenzheng=!0,u.abrupt("continue",18);case 48:if("hunfou"!=c){u.next=52;break}return t.ruleForm.hunfou=o[c],t.ro.hunfou=!0,u.abrupt("continue",18);case 52:u.next=18;break;case 54:t.styleChange();case 55:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},hunfouChange:function(e){this.hunfouIndex=e.target.value,this.ruleForm.hunfou=this.hunfouOptions[this.hunfouIndex]},touxiangTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.touxiang=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return a(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.yonghuming){n.next=3;break}return e.$utils.msg("用户名不能为空"),n.abrupt("return");case 3:if(e.ruleForm.mima){n.next=6;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 6:if(!e.ruleForm.shouji||e.$validate.isMobile(e.ruleForm.shouji)){n.next=9;break}return e.$utils.msg("手机应输入手机格式"),n.abrupt("return");case 9:if(!e.ruleForm.shenfenzheng||e.$validate.checkIdCard(e.ruleForm.shenfenzheng)){n.next=12;break}return e.$utils.msg("身份证应输入身份证格式"),n.abrupt("return");case 12:if(!e.ruleForm.id){n.next=17;break}return n.next=15,e.$api.update("yonghu",e.ruleForm);case 15:n.next=19;break;case 17:return n.next=19,e.$api.add("yonghu",e.ruleForm);case 19:e.$utils.msgBack("提交成功");case 20:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,u=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,u=u>9?u:"0"+u,"".concat(t,"-").concat(r,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,t("543d")["default"])},"9f93":function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return u})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return r}));var u=function(){var e=this,n=e.$createElement;e._self._c},i=[]},c60e:function(e,n,t){"use strict";(function(e){t("0875");r(t("66fd"));var n=r(t("13b1"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["c60e","common/runtime","common/vendor"]]]);