package helpinghand.govinfo.TrialPages;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Rasil10 on 2017-12-13.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "officeDetail";

    // Contacts table name
    private static final String TABLE_OFFICES = "office";
    private static final String TABLE_DOCUMENTS = "documents";
    private static final String TABLE_FAQs = "faqs";

    // Contacts Table Columns names
    private static final String KEY_ID_OFFICES = "id";
    private static final String KEY_NAME_OFFICES = "name";
    private static final String KEY_PHONE_OFFICES = "phone";
    private static final String KEY_LOCATION_1_OFFICES = "location1";
    private static final String KEY_LOCATION_2_OFFICES = "location2";
    private static final String KEY_LOCATION_3_OFFICES = "location3";
    private static final String KEY_LOCATION_4_OFFICES = "location4";
    private static final String KEY_SHORT_DETAIL_OFFICES = "shortDetail";
    private static final String KEY_TYPE_OFFICES = "type";
    private static final String KEY_BUSY_RATING_OFFICES = "busyRating";


    //Documents table Columns names
    private static final String KEY_ID_DOCUMENTS = "id";
    private static final String KEY_DOC_1_DOCUMENTS = "doc1";
    private static final String KEY_DOC_2_DOCUMENTS = "doc2";
    private static final String KEY_DOC_3_DOCUMENTS = "doc3";
    private static final String KEY_DOC_4_DOCUMENTS = "doc4";
    private static final String KEY_DOC_5_DOCUMENTS = "doc5";
    private static final String KEY_DOC_6_DOCUMENTS = "doc6";
    private static final String KEY_DOC_7_DOCUMENTS = "doc7";
    private static final String KEY_DOC_8_DOCUMENTS = "doc8";
    private static final String KEY_DOC_9_DOCUMENTS = "doc9";
    private static final String KEY_DOC_10_DOCUMENTS = "doc10";
    private static final String KEY_MONEY_DOCUMENTS = "money";

    //FAQs table Columns names
    private static final String KEY_ID_FAQs = "id";
    private static final String KEY_QUESTION_1_FAQs = "question1";
    private static final String KEY_QUESTION_2_FAQs = "question2";
    private static final String KEY_QUESTION_3_FAQs = "question3";
    private static final String KEY_QUESTION_4_FAQs = "question4";
    private static final String KEY_QUESTION_5_FAQs = "question5";
    private static final String KEY_QUESTION_6_FAQs = "question6";
    private static final String KEY_QUESTION_7_FAQs = "question7";
    private static final String KEY_QUESTION_8_FAQs = "question8";
    private static final String KEY_QUESTION_9_FAQs = "question9";
    private static final String KEY_QUESTION_10_FAQs = "question10";
    private static final String KEY_ANSWER_1_FAQs = "answer1";
    private static final String KEY_ANSWER_2_FAQs = "answer2";
    private static final String KEY_ANSWER_3_FAQs = "answer3";
    private static final String KEY_ANSWER_4_FAQs = "answer4";
    private static final String KEY_ANSWER_5_FAQs = "answer5";
    private static final String KEY_ANSWER_6_FAQs = "answer6";
    private static final String KEY_ANSWER_7_FAQs = "answer7";
    private static final String KEY_ANSWER_8_FAQs = "answer8";
    private static final String KEY_ANSWER_9_FAQs = "answer9";
    private static final String KEY_ANSWER_10_FAQs = "answer10";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_OFFICES_TABLE = "CREATE TABLE " + TABLE_OFFICES +
                "("
                + KEY_ID_OFFICES + " INTEGER PRIMARY KEY,"
                + KEY_NAME_OFFICES + " TEXT,"
                + KEY_PHONE_OFFICES + " TEXT,"
                + KEY_LOCATION_1_OFFICES + " TEXT"
                + KEY_LOCATION_2_OFFICES + " TEXT"
                + KEY_LOCATION_3_OFFICES + " TEXT"
                + KEY_LOCATION_4_OFFICES + " TEXT"
                + KEY_SHORT_DETAIL_OFFICES + " TEXT"
                + KEY_TYPE_OFFICES + " TEXT"
                + KEY_BUSY_RATING_OFFICES + " INTEGER"
                + ")";

        String CREATE_DOCUMENT_TABLE = "CREATE TABLE " + TABLE_DOCUMENTS +
                "("
                + KEY_ID_DOCUMENTS + " INTEGER PRIMARY KEY,"
                + KEY_DOC_1_DOCUMENTS + " TEXT,"
                + KEY_DOC_2_DOCUMENTS + " TEXT,"
                + KEY_DOC_3_DOCUMENTS + " TEXT"
                + KEY_DOC_4_DOCUMENTS + " TEXT"
                + KEY_DOC_5_DOCUMENTS + " TEXT"
                + KEY_DOC_6_DOCUMENTS + " TEXT"
                + KEY_DOC_7_DOCUMENTS + " TEXT"
                + KEY_DOC_8_DOCUMENTS + " TEXT"
                + KEY_DOC_9_DOCUMENTS + " TEXT"
                + KEY_DOC_10_DOCUMENTS + " TEXT"
                + KEY_MONEY_DOCUMENTS + " INT"
                + ")";

        String CREATE_FAQs_TABLE = "CREATE TABLE " + TABLE_FAQs +
                "("
                + KEY_ID_FAQs + " INTEGER PRIMARY KEY,"
                + KEY_QUESTION_1_FAQs + " TEXT,"
                + KEY_ANSWER_1_FAQs + " TEXT,"
                + KEY_QUESTION_2_FAQs + " TEXT,"
                + KEY_ANSWER_2_FAQs + " TEXT,"
                + KEY_QUESTION_3_FAQs + " TEXT,"
                + KEY_ANSWER_3_FAQs + " TEXT,"
                + KEY_QUESTION_4_FAQs + " TEXT,"
                + KEY_ANSWER_4_FAQs + " TEXT,"
                + KEY_QUESTION_5_FAQs + " TEXT,"
                + KEY_ANSWER_5_FAQs + " TEXT,"
                + KEY_QUESTION_6_FAQs + " TEXT,"
                + KEY_ANSWER_6_FAQs + " TEXT,"
                + KEY_QUESTION_7_FAQs + " TEXT,"
                + KEY_ANSWER_7_FAQs + " TEXT,"
                + KEY_QUESTION_8_FAQs + " TEXT,"
                + KEY_ANSWER_8_FAQs + " TEXT,"
                + KEY_QUESTION_9_FAQs + " TEXT,"
                + KEY_ANSWER_9_FAQs + " TEXT,"
                + KEY_QUESTION_10_FAQs + " TEXT,"
                + KEY_ANSWER_10_FAQs + " TEXT,"
                + KEY_QUESTION_1_FAQs + " TEXT,"
                + KEY_ANSWER_1_FAQs + " TEXT,"
                + ")";

        sqLiteDatabase.execSQL(CREATE_OFFICES_TABLE);
        sqLiteDatabase.execSQL(CREATE_DOCUMENT_TABLE);
        sqLiteDatabase.execSQL(CREATE_FAQs_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_OFFICES);
        onCreate(sqLiteDatabase);
    }


    //add required fields
    void addOffice(OfficeInfo officeInfo) {

    }

    void addRequiredDocs(RequiredDocsInfo requiredDocsInfo) {

    }

    void addFAQs(FAQsInfo faQsInfo) {

    }


    //get single required info
    OfficeInfo getOffice(int id) {
        OfficeInfo office = new OfficeInfo();


        return office;
    }

    RequiredDocsInfo getRequiredDoc(int id) {

        RequiredDocsInfo docsInfo = new RequiredDocsInfo();


        return docsInfo;

    }

    FAQsInfo getFAQ(int id) {
        FAQsInfo faq = new FAQsInfo();


        return faq;
    }


    //get all required infos

    public ArrayList<OfficeInfo> getAllOffices() {
        ArrayList<OfficeInfo> officeInfos = new ArrayList<>();


        return officeInfos;
    }

    public ArrayList<RequiredDocsInfo> getAllrequiredDocInfos() {
        ArrayList<RequiredDocsInfo> requiredDocsInfos = new ArrayList<>();


        return requiredDocsInfos;
    }

    public ArrayList<FAQsInfo> getAllFAQS() {
        ArrayList<FAQsInfo> faQsInfos = new ArrayList<>();


        return faQsInfos;
    }


    //get all info count

    int getOfficeCount() {
        int count = 0;


        return count;
    }

    int getRequiredDocCount() {
        int count = 0;


        return count;
    }

    int getRequiredFAQCount() {
        int count = 0;

        return count;
    }


}
