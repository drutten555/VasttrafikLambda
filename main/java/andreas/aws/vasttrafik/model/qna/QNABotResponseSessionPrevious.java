package andreas.aws.vasttrafik.model.qna;

public class QNABotResponseSessionPrevious
{
    /*
    "previous":
    {
        "qid": "General_question_get_stop_1_en",
        "a": "Sorry can't find any information about busses or trams.",
        "alt":
        {
            "markdown": "**Hello** is this the thing I am looking for?  \nAre you at the other line?  \n**Hello?**",
            "ssml": ""
        },
        "q": "when do the buss leave?"
    },
    */

    String qid;
    String a;
    QNABotResponseSessionPreviousAlt alt;
    String q;

}