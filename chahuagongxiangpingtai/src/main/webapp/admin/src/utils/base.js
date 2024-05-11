const base = {
    get() {
        return {
            url : "http://localhost:8080/chahuagongxiangpingtai/",
            name: "chahuagongxiangpingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/chahuagongxiangpingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "插画共享平台"
        } 
    }
}
export default base
