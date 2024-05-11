const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmer602/",
            name: "ssmer602",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmer602/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院体检管理系统"
        } 
    }
}
export default base
