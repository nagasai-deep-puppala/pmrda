
function loadChart(data){
	var areaData =[];
	var demolishedBuildingData =[];
	var illegalBuildingData =[];
	var regularisedBuildingData =[];
	var pendingBuildingData =[];
	var villageInfo="Sorry NO DATA"
	var temp= $(data.data).map(function(index,value) {
		 areaData[index]=value.area;
		 demolishedBuildingData[index]=value.demolishedBuildingCount;
		 illegalBuildingData[index]=value.illegalBuildingCoungt;
		 regularisedBuildingData[index]=value.regularisedBuildingCount;
		 pendingBuildingData[index]=value.pendingBuildingCount;
		 villageInfo=value.taluka+'/'+value.village
		 return villageInfo;
	  }).get();
    	
	mainChart(areaData,illegalBuildingData,villageInfo,'Illegal Building',"container1");
	mainChart(areaData,regularisedBuildingData,villageInfo,'Regularised Building',"container2");
	mainChart(areaData,illegalBuildingData,villageInfo,'Demolished Building',"container3");
	mainChart(areaData,illegalBuildingData,villageInfo,'Pending Building',"container4");
     
    }


function mainChart(areaData,buildingData,VillageInfo,tittleData,divTagIdInfo){
	
	var chart={
        	type: 'bar'
            
        }
    	
    	var  title= {
            text: tittleData
        }
    	var  subtitle= {
            text: ''
        }
    	
    	var xAxis= {
            categories:areaData,
            title: {
                text: null
            }
        }
    	
    	var  yAxis= {
            min: 0,
            title: {
                text: 'building info',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        }
    	var tooltip= {
            valueSuffix: ' buildings'
        }
    	
    	var plotOptions= {
            bar: {
                dataLabels: {
                    enabled: true
                }
            }
        }
    	
    	var legend= {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'top',
            x: -40,
            y: 80,
            floating: true,
            borderWidth: 1,
            backgroundColor:
                Highcharts.defaultOptions.legend.backgroundColor || '#FFFFFF',
            shadow: true
        }
    	
    	var credits= {
            enabled: false
        }
    	var series= [{
            name: VillageInfo,
            data: buildingData
        }]
    	
    	
    	 var json = {};   
        json.chart = chart; 
        json.title = title;   
        json.subtitle = subtitle; 
        json.tooltip = tooltip;
        json.xAxis = xAxis;
        json.yAxis = yAxis;  
        json.series = series;
        json.plotOptions = plotOptions;
        json.legend = legend;
        json.credits = credits;
        console.log(json);
     $('#'+divTagIdInfo).highcharts(json);
     //  Highcharts.chart('container', json);
}
