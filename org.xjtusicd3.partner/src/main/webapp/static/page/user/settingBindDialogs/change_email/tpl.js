define(function(require, exports, module){
    var tpl ='<div class="tpl-changeemail" style="width: 430px;">\
            \
            <div class="moco-form-group">\
                <label for="inputEmail3" class="moco-control-label">邮箱地址：</label>\
                <div class="moco-control-input">\
                    <input type="email" placeholder="请输入您的邮箱" class="moco-form-control js-email" data-validate="require-email" id="">\
                    <div class="moco-control-tip errorHint color_red"></div>\
                </div>\
            </div>\
            <div class="moco-form-group">\
                <label for="inputEmail3" class="moco-control-label"></label>\
                <div class="moco-control-input">\
                    <button class="moco-btn moco-btn-blue js-submit">确定</button>\
                     <button class="moco-btn moco-btn-normal js-modal-close">取消</button>\
                    <p class="js-gerror g_error"></p>\
                </div>\
            </div>\
        </div>\
    '

    module.exports = tpl
})