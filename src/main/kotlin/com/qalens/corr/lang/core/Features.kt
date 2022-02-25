package com.qalens.corr.lang.core
//private fun all_functions_syntax():Map<String,List<String>>{
//    return mapOf(
//        "concat" to listOf("\"First\"","\"Second\"","..."),
//        "lpad" to listOf("\"123\"","0","10"),
//    )
//}
private fun other_functions(with:String?):List<String> {
    val withComma= if (with!=null) "$with," else ""
    val withP = if (with!=null) "$with" else ""
    return listOf(
        "concat(${withComma}\"Hello\")",
        "lpad(${withComma}\"0\",10)",
        "rpad(${withComma}\"0\",10)",
        "left(${withComma}4)",
        "right(${withComma}4)",
        "mid(${withComma}10,4)",
        "from_json(${withP})",
        "random_element(${withP})",
        "encode(${withP})",
        "now(${withP})",
        "contains(${withComma}\"Hello\")",
        "indexOf(${withComma}\"Hello\")",
        "len(${withP})",
        "round(${withComma}2)",
        "random(${withComma}10000)",
        "unique_random_elements(${withComma}array)",
        "array(${withComma}eachElement)",
    )
}
fun zero_arg_functions():List<String>{
    return listOf(
        "timestamp()",
        "uuid()",
        "now()"
    )
}
fun variable_scope_functions():List<String>{
    return other_functions(null)+ listOf("fake()")
}
private fun fake_function_full():List<String> {
    return fake_funtions().map { "fake(\"$it\")" }
}
fun no_variable_scope_functions():List<String> {
    return other_functions("\"Hello\"") + fake_function_full() + zero_arg_functions()
}
private fun fake_funtions():List<String>{
    return listOf(
    "Name",
    "FirstName",
    "LastName",
    "Title",
    "Suffix",
    "NameWithTitle",
    "CompanySuffix",
    "CompanyName",
    "Profession",
    "CityName",
    "StreetName",
    "StateName",
    "StateAbbr",
    "ZipCode",
    )
}