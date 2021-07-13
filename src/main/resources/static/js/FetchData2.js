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
    
    $("#Taluka_id").change(function() {
        getdata();
    });
   

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

    
    $("#fetch_data").click(function() {
        fetchdata();
    });


    function fetchdata() {
        var taluka = $("#Taluka_id").val();
        var Village = $("#Village_id").val();
        var url = 'pieData/' + taluka + '/' + Village;
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

    // LOAD CHART ON LOAD 
    Onloadfetchdata();
   
    function Onloadfetchdata() {

        fetchdatabyURL('pieData/taluka-3/village-1')
    }

   

   
});