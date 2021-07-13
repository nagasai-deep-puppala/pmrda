
function loadChart(data){
	
		var pie_data_final=[];
	var temp= $(data.data).map(function(index,value) {
		pie_data_illegal={};
		pie_data_legal={};
		console.log(data);
		if(index==0){
			
		
		pie_data_legal["name"]="legal";
		pie_data_legal["y"]=value.legalBuildingPer;
		//pie_data_legal["sliced"]=true;
		//pie_data_legal["selected"]=true;
		
		pie_data_illegal["name"]="illegal";
		pie_data_illegal["y"]=value.illegalBuildingPer;
		pie_data_final[0]=pie_data_legal;
		pie_data_final[1]=pie_data_illegal;
		}
		
		 return "hi";
	  }).get();
    	
	mainChart(pie_data_final);
	
     
    }


function mainChart(data){
	
	var chart={
			plotBackgroundColor: null,
	        plotBorderWidth: null,
	        plotShadow: false,
	        type: 'pie'
            
        }
    	
    	var  title= {
            text: "Buildings"
        }
	
	var tooltip= {
            valueSuffix: ' buildings'
        }
	var  accessibility= {
        point: {
            valueSuffix: '%'
        }
    }
	
    	
    	    	
    	
    	var plotOptions= {
			pie: {
	            allowPointSelect: true,
	            cursor: 'pointer',
	            dataLabels: {
	                enabled: true,
	                format: '<b>{point.name}</b>: {point.percentage:.1f} %'
	            }
	        }
        }
    	
    	
    	var series= [{
            name: 'Buildings',
            colorByPoint: true,
            data:data
        }]
    	
    	
    	 var json = {};   
        json.chart = chart; 
        json.title = title;   
        json.tooltip = tooltip;
        json.series = series;
        json.plotOptions = plotOptions;
        console.log(json);
     $('#container').highcharts(json);
     //  Highcharts.chart('container', json);
}
