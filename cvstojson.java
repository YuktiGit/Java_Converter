public String CSVtoJSON(String output) {

    String[] lines = output.split("\n");

    StringBuilder builder = new StringBuilder();
    builder.append('[');
    String[] headers = new String[0];

    //CSV TO JSON
    for (int i = 0; i < lines.length; i++) {
        String[] values = lines[i].replaceAll("\"", "").split("۞");

        if (i == 0) //INDEX LIST
        {
            headers = values;
        } else {
            builder.append('{');
            for (int j = 0; j < values.length && j < headers.length; j++) {

                String jsonvalue = "\"" + headers[j] + "\":\"" + values[j] + "\"";
                if (j != values.length - 1) { //if not last value of values...
                    jsonvalue += ',';
                }
                builder.append(jsonvalue);
            }
            builder.append('}');
            if (i != lines.length - 1) {
                builder.append(',');
            }
        }
    }
    builder.append(']');
    output = builder.toString();

    return output;
}