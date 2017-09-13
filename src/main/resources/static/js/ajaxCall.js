function getWeather(){
var byNavn = document.getElementById("byNavn").value;
$.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/getWeatherByCityName",
        data: "byNavn="+byNavn,
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);


        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);



        }
    });

}