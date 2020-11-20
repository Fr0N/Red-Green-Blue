let ws = null;
let url = "ws://localhost:8080/rgb";

(function () {
    ws = new WebSocket(url);
    ws.onopen = function() {
        console.log('Info: Connection Established.');
    };

    ws.onmessage = function(event) {
        console.log(event.data);
        result.style.backgroundColor = event.data;
    };

    ws.onerror = function(event) {
        console.log('Error: ' + event)
    }

    ws.onclose = function(event) {
        console.log('Info: Closing Connection.');
    };

    let body = document.body,
        r = document.querySelector('#r'),
        g = document.querySelector('#g'),
        b = document.querySelector('#b'),
        outputR = document.querySelector('#outputR'),
        outputG = document.querySelector('#outputG'),
        outputB = document.querySelector('#outputB'),
        result = document.querySelector("#result");

    r.addEventListener('input', function() {
      outputR.value = r.value;
      ws.send(JSON.stringify({
        color:'red',
        value: r.value
         }));
    }, false);

    g.addEventListener('input', function() {
      outputG.value = g.value;
      ws.send(JSON.stringify({
            color:'green',
            value: g.value
             }))
    }, false);

    b.addEventListener('input', function() {
      outputB.value = b.value;
      ws.send(JSON.stringify({
          color:'blue',
          value: b.value
           }))
    }, false);
})()

