/**
 * Created by stack on 2016/4/25.
 */
require(['js/functions.js'], function ($){
    // some code here
});

/*ͨ�����*/
$(function(){
    //�����˵�
    $(".top-group").hover(function(){
        $(this).children(".user-menu").show();
    },function(){
        $(this).children(".user-menu").hide();
    });
    //��ʾ������
    $('.search').each(function(){
        $(this).click(function() {
           $('.search-frame').show('slow');
        });
    });
    //�ر�������
    $('.search-close').each(function(){
        $(this).click(function() {
            $('.search-frame').hide('slow');
        });
    });

    //�ж��Ƿ��Ѿ���Ҫ�ö�
    $(window).scroll(function(){
        //var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
        if($(window).scrollTop() >= 100){
            $('.sticky').show('slow');
        }else{
            $('.sticky').hide('slow');
        }
    });
    //һ�����ض���
    $('.sticky a').click(function(){
        $('html body').animate({scrollTop: '0px'}, 800);
    })

});