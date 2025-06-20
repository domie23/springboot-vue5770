const base = {
    get() {
        return {
            url : "http://localhost:8080/yingyuangoupiao/",
            name: "yingyuangoupiao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yingyuangoupiao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "影院购票系统"
        } 
    }
}
export default base
