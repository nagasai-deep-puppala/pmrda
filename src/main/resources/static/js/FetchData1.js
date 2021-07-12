$(document).ready(function() {




    var tname = "text";
    $.get('getData', {}, function(jsonResponse) {
        console.log(jsonResponse);
        var select = $('#Taluka_id');
        select.find('option').remove();
        $('<option  selected>').val("").text("Select Taluka").appendTo(select);
        $.each(jsonResponse, function(index, value) {
            $('<option>').val(value).text(value).appendTo(select);
        });

    });
    // LOAD CHART ON LOAD 
    Onloadfetchdata();
   
    function Onloadfetchdata() {

        fetchdatabyURL('IllegarCon/taluka-3/village-1')
    }


    function getdata() {
        var taluka = $("#Taluka_id").val();

        $.get('getVillages/' + taluka, {}, function(jsonResponse) {
            var select = $('#Village_id');
            select.find('option').remove();
            $('<option  selected>').val("").text("Select Village").appendTo(select);
            $.each(jsonResponse, function(index, value) {
                $('<option>').val(value).text(value).appendTo(select);
            });

        });
    }


    function fetchdata() {
        var taluka = $("#Taluka_id").val();
        var Village = $("#Village_id").val();
        var url = 'IllegarCon/' + taluka + '/' + Village;
        if (taluka.length > 0 && Village.length > 0) {
            fetchdatabyURL(url);
        } else {
            alert("Please Select Taluka or Village ");
        }

    }

    function fetchdatabyURL(url) {
        $.get(url, {}, function(jsonResponse) {
            loadChart(jsonResponse)

        });

    }



    $("#Taluka_id").change(function() {
        getdata();
    });

    $("#fetch_data").click(function() {
        fetchdata();
    });

});