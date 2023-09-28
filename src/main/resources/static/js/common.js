$(function() {
    $.ajaxSetup({
        headers: {
            'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
        }
    });
    // Ajax通信 ゲーム開始ボタンクリック
    $('#btnStart').on('click', function(event){
        event.preventDefault();
        // outputDataを空に初期化
        $("#gamingArea").html("");
        $form = $('#startForm');
        $.ajax({
            type: $form.attr('method'),
            url : $form.attr('action'),
            data: $form.serialize(),
            beforeSend : function(xhr, settings){
                //Buttonを無効にする
                $('#btnStart').attr('disabled' , true);
            },
        }).always(function(xhr, textStatus){
                //Buttonを有効にする
                $('#btnStart').attr('disabled' , false);
        }).done(function(data,status,xhr) {
                $("#gamingArea").html(data);
        }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
                alert("status:" + XMLHttpRequest.status + ",textStatus:" + textStatus + ",errorThrown:" + errorThrown);
        });
    });
    // Ajax通信 手札交換ボタンクリック
    $('body').on('click', '#btnChange', function(event){
        if($('.hands input[type="checkbox"]:checked').length == 0){
            alert('交換するカードを選択してください。');
            return;
        }
        event.preventDefault();
        $form = $('#gamingForm');
        $.ajax({
            type: $form.attr('method'),
            url : $form.attr('action'),
            data: $form.serialize(),
            beforeSend : function(xhr, settings){
                //Buttonを無効にする
                $('#btnStart').attr('disabled' , true);
                $('#btnChange').attr('disabled' , true);
                $('#btnShowDown').attr('disabled' , true);
            }
        }).always(function(xhr, textStatus){
                //Buttonを有効にする
                $('#btnStart').attr('disabled' , false);
                $('#btnChange').attr('disabled' , false);
                $('#btnShowDown').attr('disabled' , false);
        }).done(function(data,status,xhr) {
                $("#gamingArea").html("");
                $("#gamingArea").html(data);
        }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
                alert("status:" + XMLHttpRequest.status + ",textStatus:" + textStatus + ",errorThrown:" + errorThrown);
        });
    });
    // Ajax通信 ショーダウンボタンクリック
    $('body').on('click', '#btnShowDown', function(event){
        if($('.handlist input[type="radio"]:checked').length == 0){
            alert('役を選択してください。');
            return;
        }
        event.preventDefault();
        $gamingForm = $('#gamingForm');
        $showDownForm = $('#showDownForm');
        $.ajax({
            type: $showDownForm.attr('method'),
            url : $showDownForm.attr('action'),
            data: $gamingForm.serialize(),
            beforeSend : function(xhr, settings){
                //Buttonを無効にする
                $('#btnStart').attr('disabled' , true);
                $('#btnChange').attr('disabled' , true);
                $('#btnShowDown').attr('disabled' , true);
            }
        }).always(function(xhr, textStatus){
                //Buttonを有効にする
                $('#btnStart').attr('disabled' , false);
                $('#btnChange').attr('disabled' , false);
                $('#btnShowDown').attr('disabled' , false);
        }).done(function(data,status,xhr) {
                $("#gamingArea").html("");
                $("#gamingArea").html(data);
        }).fail(function(XMLHttpRequest, textStatus, errorThrown) {
                alert("status:" + XMLHttpRequest.status + ",textStatus:" + textStatus + ",errorThrown:" + errorThrown);
        });
    });
});