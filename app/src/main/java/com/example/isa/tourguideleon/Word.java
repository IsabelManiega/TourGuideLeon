package com.example.isa.tourguideleon;



public class Word {
    // texto
    private String mTextTranslation;
    //titulo
    private String mTitleTranslation;
    //añadir imagen
    private int mImageResourceId;
    //añadir imagen mapa
    private int mMapaResourceId;


    /**
     * * Create a new Word object.
     *
     * @param textTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param titleTranslation is the word in the Miwok language
     * @param ImagenResourceId
     * @param MapaResorceId
     */
    public Word(String textTranslation, String titleTranslation,int ImagenResourceId,int MapaResorceId) {
        mTextTranslation = textTranslation;
        mTitleTranslation = titleTranslation;
        mImageResourceId = ImagenResourceId;
        mMapaResourceId = MapaResorceId;
    }
    /**
     * Get the default translation of the word.
     */
    public String getTextTranslation() {
        return mTextTranslation;}

    /**
     * Get the Miwok translation of the word.
     */
    public String getTitleTranslation() {
        return mTitleTranslation;}

    /**
     * Get the imagen of the word.
     */

    public int getImageResourceId() {
        return mImageResourceId;}
    /**
     * Get the Mapa of the word.
     */

    public int getMapaResourceId() {
        return mMapaResourceId;}
}
