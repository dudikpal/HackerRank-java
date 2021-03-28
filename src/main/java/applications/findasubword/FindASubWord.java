package applications.findasubword;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubWord {
    
    public String check(){
        
        String testString = "30\n" +
                                "pill,take take(eastern mad)take take'top upward)take)mostly take(chance producer.take(apologize rest_take take'allied terrible(take.easy\n" +
                                "mineral_chew,midnight relationship,chew railway(chew tomato-chew'professional chew(deal receive)chew,possibly scenechew chew.alarm chew(clap prove-chew\n" +
                                "insert'local insert)bend hall-insert insert.desert exaggerate'insert,clearly disagreementinsert-like insert-gradual steel(insert even-insert.nobody bend(insertpitch\n" +
                                "wallet)take beak-take packagingtake(great effectively-take,for take-age accurate,take federal,take take-article non(take sexually_take\n" +
                                "insert,later additional.insert)unpleasant tooinsert.decide wasteinsert,contrast access,insert attachinsert garbage_insert_blame insert-complicate data.insert forever)insert-ex\n" +
                                "insert,awful varied(insert)attend knock.insert moreover(insert remove'insert emergency(insert underwear(insert.rice insert-everything loudly'insert-put threat)insertgo\n" +
                                "insert'colleague skilful(insert-study face,insert slow'insert sex,insert(calculation thief'insert,egg ordinary'insert_politically insertsteeply exhibitinsert(scientific boss_insert-appearance\n" +
                                "although,take_permission take'surprised a)take'for closet-take definitely)take-show takesqueeze take.surely stripe-take take.breathing takeapparent\n" +
                                "chew,whisper unusually)chew bread.chew chewfall sport.chew,money chew-muscle deliberate-chew marketing-chewaid exaggerate,chew(fun chew.unwilling\n" +
                                "unknown'insert'silly insert)logical insert'useful building-insert alarm,insert insert(worrying insert(comfort score(insert bent'insert_produce critical(insert\n" +
                                "grammarinsert insert'grammar insertbarrier insert_junior easy,insert_writer programme.insert financial_insert button,insert insert-maybe obey-insert\n" +
                                "insert)tomato depositinsertknock neighbourhood(insert insert-relationship operateinsert)in insert.spin entire.insert insert(sensitive customerinsert)niece amount,insert\n" +
                                "relative)chew status_chewgain chew.countryside determination)chew_accompany the,chew,consumer spring'chew'process insectchew.opposing shell-chew chew_heavily self.chew\n" +
                                "chew'revision where(chew openly'chew assistant-chew chew_secretary chew,pole chew(curious coffee(chew them,chew anyone)chew'unlike\n" +
                                "insert-rarely insert_strange insert.outline tie.insert geography(insert,invite severelyinsert married)insert(industrial mg_insert'institute visit,insert-unlike associated)insert\n" +
                                "crisp,chew he-chew,special distributionchew.decision rent_chew-toy self-chew,addition rudechew(unable chew'polish chew,particularly analysis_chew(shoulder landchewpocket\n" +
                                "writer_chew chew.base chew(deserve chew.lively diet(chew_painting back)chew chew(cause tire(chew)feather entrance'chew,satisfy rudelychew,removal\n" +
                                "fail'chew(angrily biscuit)chew'suitcase kindly)chew)cover chewcommission chew(presumably cinemachewgirl stand(chew_scare aim)chew,shy favour)chewdraft bear_chew\n" +
                                "sharply,take following(take.express dull-take difficultytake)bad take.phone nonsense-take take-mysterious take.towards rival(take_reward take-mysterious\n" +
                                "shy,take(cardboard take_double sincerely(take_correctly be'take.pay p'take profession(take.article drawer-take qualifytake take_penny qualified(take\n" +
                                "proud'chew chew.enemy crowd'chewjoin finely'chew channel'chew)pile chew'squeeze producer'chew_emphasize season)chew insurance)chewcontinuously accompany_chew\n" +
                                "chew)bread criminalchew basic)chew unfriendly,chew chew.poetry report'chew)critical ignore'chew_buy chew'adjust chew_burst press(chew\n" +
                                "beard,take tell.take,l concentrate-take takechannel take_find take-message take_owner defeat.takeleast mix(take.pig network)take(chin\n" +
                                "fightingchew_unemployment narrow_chew visitor_chew'soup estimate'chew_packaging revolution'chew opposingchew suspectchew,program international(chewsmooth hungry,chew)backward again'chew\n" +
                                "post.insert apple'insert,stage apart.insert itself(insert insert-design insert_mum controlledinsert,fortune december-insert(discovery insert,uncontrolled smoothly_insert\n" +
                                "insert(membership substance_insert.rather insert,publication ability)insert insert-arise west(insert insert)weekly seriously(insert private,insert-wake training-insert\n" +
                                "addinsert-friendly insert-cut insert)plastic insert,version refrigerator(insert(engineering insert-thanks approximately(insert insertsecretly insert.self promote.insert\n" +
                                "run.insert in,insert horror'insert insert(breathe ms,insert,amazed beside,insert insertreward appeal(insert'crop link(insert inserthelpful\n" +
                                "take.central crop_take cough-take)by smoothly(take in_take_maintain nicely-take extent(take.stage fee)take,concern celebrate)take'bottle salt(take\n" +
                                "never(insert east(insert,jacket quit(insert_whoever insertensure swollen,insert north(insert.she envelope-insert suffering.insert insert.regard maintain)insert_his\n" +
                                "3\n" +
                                "take\n" +
                                "insert\n" +
                                "chew";
        
        String[] testStrings = testString.split("\n");
        StringBuilder sentences = new StringBuilder();
        int index = 0;
        int lineOfSentence = Integer.parseInt(testStrings[index++].trim());
        
        for (int i = 1; i < lineOfSentence + 1; i++) {
            sentences.append(testStrings[index].trim() + " ");
            index++;
        }
        int subWordsNumber = Integer.parseInt(testStrings[index++].trim());
        List<String> subStrings = new ArrayList<>();
        for (int i = index; i < testStrings.length; i++) {
            subStrings.add(testStrings[index]);
            index++;
        }
        int counter = 0;
        Pattern p;
        StringBuilder result = new StringBuilder();
        for (String subWord : subStrings) {
            String pattern = "\\w+" + subWord + "\\w+";
            p = Pattern.compile(pattern);
                for (String word : sentences.toString().split("\\W+")) {
                    Matcher m = p.matcher(word);
                    if (m.find()) {
                        counter++;
                    }
                }
            result.append(counter + "\n");
            counter = 0;
        }
        return result.toString();
    }
}
