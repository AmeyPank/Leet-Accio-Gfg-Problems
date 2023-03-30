<!DOCTYPE html>
<html>
<head>
    <title>Example</title>
</head>
<body>
    <div id="output"></div>

    <script>
        function updateOutput() {
            const outputElement = document.getElementById("output");

            return new Promise((resolve) => {
                setTimeout(() => {
                    resolve("Hello, world!");
                }, 1000);
            }).then((result) => {
                outputElement.innerText = result;
            });
        }

        updateOutput();
    </script>
</body>
</html>