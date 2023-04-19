const inputs = document.querySelectorAll(".input");

function focusFunction(){
    let parentNode = this.parentNode.parentNode;
    parentNode.classList.add('focus');
}
function blurFunction(){
    let parentNode = this.parentNode.parentNode;
    if(this.value == ''){
        parentNode.classList.remove('focus');
    }
}

inputs.forEach(input=>{
    input.addEventListener('focus',focusFunction);
    input.addEventListener('blur',blurFunction);
});


layui.config({
    base: 'dist/sliderVerify/'
}).use(['sliderVerify', 'jquery', 'form'], function() {
    var sliderVerify = layui.sliderVerify,
        $ = layui.jquery,
        form = layui.form;
    var slider = sliderVerify.render({
        elem: '#slider',
        onOk: function(){//当验证通过回调
            layer.msg("验证通过");
        }
    })

    //监听提交
    form.on('submit(formDemo)', function(data) {
        //layer.msg(JSON.stringify(data.field));
        $.ajax({
            type: 'POST',
            url: '/user/login',
            data: JSON.stringify(data.field),
            datatype: 'json',
            contentType: 'application/json',
            success: function (res) {
                /*console.log(JSON.stringify(data.field))
                console.log(res)*/
                if (res.code == 1){
                    layer.msg("登录成功");
                    window.location.href="/main.html"
                }else {
                    layer.msg("登录失败");
                }
            }
        })
        return false;
    })

})