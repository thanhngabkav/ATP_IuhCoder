/**
 * Created by lldtien on 8/10/2017.
 */
$(document).ready(function () {
    var characterCode = 65; // A
    $("#addMoreProblem").click(function () {
        ++characterCode;
        var innerHTML = '<div class="form-group row">' +
            '<label for="problemName" class="col-2 col-form-label">Problem ' + String.fromCharCode(characterCode) + '</label>' +
            '<div class="col-4"><input id="problemName" name="problemName" class="form-control" type="text" value></div></div>'
        $("#contestForm").append(innerHTML);

    });
});