package com.monosem.formulaire.Entity;

import jakarta.persistence.*;



@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    private String prenom;


    private String fonction;

    private String votreEntreprise;


    private String noteGeneraleAvantQuestionnaire;

    @Column(columnDefinition ="text")
    private String pointsFortsAvantQuestionnaire;

    @Column(columnDefinition ="text")
    private String pointsFaiblesAvantQuestionnaire;


    private String semoirs;

    private String bineuse;

    private String semoirsMaraichers;


    private int noteGenerale;


    private int notePointsForts;


    private int notePointsFaibles;


    private int accueilnoteGeneraleAttribuees;


    private int accueilDisponibiliteRapiditeReponsesDemandes;


    private int accueilPresenceEquipeCommercialeMonosem;


    private int commercialPresenceEquipe;


    private int commercialEnrCommandesSuivi;


    private int commercialGestDemandesSpecial;


    private int commercialPertinenceComprehensionVente;


    private int marketingPromotionMarque;

    private int marketingSupportVente;


    private int marketingInfoProduitModif;


    private int marketingFaciliteUtilisation;
    private int marketingConvialiteSiteWeb;
    private int marketingPresenceReseauxSociaux;


    private int formationComm;


    private int formationSemoirsElectriquesFonct;


    private int formationTechniciens;


    private int formationMontage;


    private int logistiqueDisponibiliteMat;


    private int logistiqueInfoDelais;


    private int logistiqueRespectDelais;


    private int logistiqueQualiteEmballages;


    private int qualiteProduitsFinition;


    private int qualiteConforProduitsLivres;


    private int qualiteMontageUsine;


    private int supportGestionProblemeTech;


    private int supportCondGestionGaranties;

    private int supportFaciliteUtilisateurOutilWeb;


    private int supportQualiteSupportsTech;

    private int supportPresenceEquipeTech;



    private int pceRechangeSupportPceRechange;


    private int pceRechangeEnrSuiviComm;


    private int pceRechangeInteretKitsRenovation;


    private int pceRechangeDispoLivraisonPiece;


    private int conceptEvolErgoFaciliteUtil;


    private int conceptEvolCorrOffreBesoin;

    private int conceptEvolCapaciteInnov;


    private int conceptEvolDesignProduits;


    private int qualitePrixMatMarche;



    private int qualitePceRechange;


    private int polEnvDemarcheEnv;

    @Column(columnDefinition ="text")
    private String commentaire;




    public User() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getVotreEntreprise() {
        return votreEntreprise;
    }

    public void setVotreEntreprise(String votreEntreprise) {
        this.votreEntreprise = votreEntreprise;
    }

    public String getNoteGeneraleAvantQuestionnaire() {
        return noteGeneraleAvantQuestionnaire;
    }

    public void setNoteGeneraleAvantQuestionnaire(String noteGeneraleAvantQuestionnaire) {
        this.noteGeneraleAvantQuestionnaire = noteGeneraleAvantQuestionnaire;
    }


    public String getPointsFortsAvantQuestionnaire() {
        return pointsFortsAvantQuestionnaire;
    }

    public void setPointsFortsAvantQuestionnaire(String pointsFortsAvantQuestionnaire) {
        this.pointsFortsAvantQuestionnaire = pointsFortsAvantQuestionnaire;
    }

    public String getPointsFaiblesAvantQuestionnaire() {
        return pointsFaiblesAvantQuestionnaire;
    }

    public void setPointsFaiblesAvantQuestionnaire(String pointsFaiblesAvantQuestionnaire) {
        this.pointsFaiblesAvantQuestionnaire = pointsFaiblesAvantQuestionnaire;
    }

    public String getSemoirs() {
        return semoirs;
    }

    public void setSemoirs(String semoirs) {
        this.semoirs = semoirs;
    }

    public String getBineuse() {
        return bineuse;
    }

    public void setBineuse(String bineuse) {
        this.bineuse = bineuse;
    }

    public String getSemoirsMaraichers() {
        return semoirsMaraichers;
    }

    public void setSemoirsMaraichers(String semoirsMaraichers) {
        this.semoirsMaraichers = semoirsMaraichers;
    }

    public int getNoteGenerale() {
        return noteGenerale;
    }

    public void setNoteGenerale(int noteGenerale) {
        this.noteGenerale = noteGenerale;
    }

    public int getNotePointsForts() {
        return notePointsForts;
    }

    public void setNotePointsForts(int notePointsForts) {
        this.notePointsForts = notePointsForts;
    }

    public int getNotePointsFaibles() {
        return notePointsFaibles;
    }

    public void setNotePointsFaibles(int notePointsFaibles) {
        this.notePointsFaibles = notePointsFaibles;
    }

    public int getAccueilnoteGeneraleAttribuees() {
        return accueilnoteGeneraleAttribuees;
    }

    public void setAccueilnoteGeneraleAttribuees(int accueilnoteGeneraleAttribuees) {
        this.accueilnoteGeneraleAttribuees = accueilnoteGeneraleAttribuees;
    }

    public int getAccueilDisponibiliteRapiditeReponsesDemandes() {
        return accueilDisponibiliteRapiditeReponsesDemandes;
    }

    public void setAccueilDisponibiliteRapiditeReponsesDemandes(int accueilDisponibiliteRapiditeReponsesDemandes) {
        this.accueilDisponibiliteRapiditeReponsesDemandes = accueilDisponibiliteRapiditeReponsesDemandes;
    }

    public int getAccueilPresenceEquipeCommercialeMonosem() {
        return accueilPresenceEquipeCommercialeMonosem;
    }

    public void setAccueilPresenceEquipeCommercialeMonosem(int accueilPresenceEquipeCommercialeMonosem) {
        this.accueilPresenceEquipeCommercialeMonosem = accueilPresenceEquipeCommercialeMonosem;
    }

    public int getCommercialPresenceEquipe() {
        return commercialPresenceEquipe;
    }

    public void setCommercialPresenceEquipe(int commercialPresenceEquipe) {
        this.commercialPresenceEquipe = commercialPresenceEquipe;
    }

    public int getCommercialEnrCommandesSuivi() {
        return commercialEnrCommandesSuivi;
    }

    public void setCommercialEnrCommandesSuivi(int commercialEnrCommandesSuivi) {
        this.commercialEnrCommandesSuivi = commercialEnrCommandesSuivi;
    }

    public int getCommercialGestDemandesSpecial() {
        return commercialGestDemandesSpecial;
    }

    public void setCommercialGestDemandesSpecial(int commercialGestDemandesSpecial) {
        this.commercialGestDemandesSpecial = commercialGestDemandesSpecial;
    }

    public int getCommercialPertinenceComprehensionVente() {
        return commercialPertinenceComprehensionVente;
    }

    public void setCommercialPertinenceComprehensionVente(int commercialPertinenceComprehensionVente) {
        this.commercialPertinenceComprehensionVente = commercialPertinenceComprehensionVente;
    }

    public int getMarketingPromotionMarque() {
        return marketingPromotionMarque;
    }

    public void setMarketingPromotionMarque(int marketingPromotionMarque) {
        this.marketingPromotionMarque = marketingPromotionMarque;
    }

    public int getMarketingSupportVente() {
        return marketingSupportVente;
    }

    public void setMarketingSupportVente(int marketingSupportVente) {
        this.marketingSupportVente = marketingSupportVente;
    }

    public int getMarketingInfoProduitModif() {
        return marketingInfoProduitModif;
    }

    public void setMarketingInfoProduitModif(int marketingInfoProduitModif) {
        this.marketingInfoProduitModif = marketingInfoProduitModif;
    }

    public int getMarketingFaciliteUtilisation() {
        return marketingFaciliteUtilisation;
    }

    public void setMarketingFaciliteUtilisation(int marketingFaciliteUtilisation) {
        this.marketingFaciliteUtilisation = marketingFaciliteUtilisation;
    }

    public int getMarketingConvialiteSiteWeb() {
        return marketingConvialiteSiteWeb;
    }

    public void setMarketingConvialiteSiteWeb(int marketingConvialiteSiteWeb) {
        this.marketingConvialiteSiteWeb = marketingConvialiteSiteWeb;
    }

    public int getMarketingPresenceReseauxSociaux() {
        return marketingPresenceReseauxSociaux;
    }

    public void setMarketingPresenceReseauxSociaux(int marketingPresenceReseauxSociaux) {
        this.marketingPresenceReseauxSociaux = marketingPresenceReseauxSociaux;
    }

    public int getFormationComm() {
        return formationComm;
    }

    public void setFormationComm(int formationComm) {
        this.formationComm = formationComm;
    }

    public int getFormationSemoirsElectriquesFonct() {
        return formationSemoirsElectriquesFonct;
    }

    public void setFormationSemoirsElectriquesFonct(int formationSemoirsElectriquesFonct) {
        this.formationSemoirsElectriquesFonct = formationSemoirsElectriquesFonct;
    }

    public int getFormationTechniciens() {
        return formationTechniciens;
    }

    public void setFormationTechniciens(int formationTechniciens) {
        this.formationTechniciens = formationTechniciens;
    }

    public int getFormationMontage() {
        return formationMontage;
    }

    public void setFormationMontage(int formationMontage) {
        this.formationMontage = formationMontage;
    }

    public int getLogistiqueDisponibiliteMat() {
        return logistiqueDisponibiliteMat;
    }

    public void setLogistiqueDisponibiliteMat(int logistiqueDisponibiliteMat) {
        this.logistiqueDisponibiliteMat = logistiqueDisponibiliteMat;
    }

    public int getLogistiqueInfoDelais() {
        return logistiqueInfoDelais;
    }

    public void setLogistiqueInfoDelais(int logistiqueInfoDelais) {
        this.logistiqueInfoDelais = logistiqueInfoDelais;
    }

    public int getLogistiqueRespectDelais() {
        return logistiqueRespectDelais;
    }

    public void setLogistiqueRespectDelais(int logistiqueRespectDelais) {
        this.logistiqueRespectDelais = logistiqueRespectDelais;
    }

    public int getLogistiqueQualiteEmballages() {
        return logistiqueQualiteEmballages;
    }

    public void setLogistiqueQualiteEmballages(int logistiqueQualiteEmballages) {
        this.logistiqueQualiteEmballages = logistiqueQualiteEmballages;
    }

    public int getQualiteProduitsFinition() {
        return qualiteProduitsFinition;
    }

    public void setQualiteProduitsFinition(int qualiteProduitsFinition) {
        this.qualiteProduitsFinition = qualiteProduitsFinition;
    }

    public int getQualiteConforProduitsLivres() {
        return qualiteConforProduitsLivres;
    }

    public void setQualiteConforProduitsLivres(int qualiteConforProduitsLivres) {
        this.qualiteConforProduitsLivres = qualiteConforProduitsLivres;
    }

    public int getQualiteMontageUsine() {
        return qualiteMontageUsine;
    }

    public void setQualiteMontageUsine(int qualiteMontageUsine) {
        this.qualiteMontageUsine = qualiteMontageUsine;
    }

    public int getSupportGestionProblemeTech() {
        return supportGestionProblemeTech;
    }

    public void setSupportGestionProblemeTech(int supportGestionProblemeTech) {
        this.supportGestionProblemeTech = supportGestionProblemeTech;
    }

    public int getSupportCondGestionGaranties() {
        return supportCondGestionGaranties;
    }

    public void setSupportCondGestionGaranties(int supportCondGestionGaranties) {
        this.supportCondGestionGaranties = supportCondGestionGaranties;
    }

    public int getSupportFaciliteUtilisateurOutilWeb() {
        return supportFaciliteUtilisateurOutilWeb;
    }

    public void setSupportFaciliteUtilisateurOutilWeb(int supportFaciliteUtilisateurOutilWeb) {
        this.supportFaciliteUtilisateurOutilWeb = supportFaciliteUtilisateurOutilWeb;
    }

    public int getSupportQualiteSupportsTech() {
        return supportQualiteSupportsTech;
    }

    public void setSupportQualiteSupportsTech(int supportQualiteSupportsTech) {
        this.supportQualiteSupportsTech = supportQualiteSupportsTech;
    }

    public int getSupportPresenceEquipeTech() {
        return supportPresenceEquipeTech;
    }

    public void setSupportPresenceEquipeTech(int supportPresenceEquipeTech) {
        this.supportPresenceEquipeTech = supportPresenceEquipeTech;
    }

    public int getPceRechangeSupportPceRechange() {
        return pceRechangeSupportPceRechange;
    }

    public void setPceRechangeSupportPceRechange(int pceRechangeSupportPceRechange) {
        this.pceRechangeSupportPceRechange = pceRechangeSupportPceRechange;
    }

    public int getPceRechangeEnrSuiviComm() {
        return pceRechangeEnrSuiviComm;
    }

    public void setPceRechangeEnrSuiviComm(int pceRechangeEnrSuiviComm) {
        this.pceRechangeEnrSuiviComm = pceRechangeEnrSuiviComm;
    }

    public int getPceRechangeInteretKitsRenovation() {
        return pceRechangeInteretKitsRenovation;
    }

    public void setPceRechangeInteretKitsRenovation(int pceRechangeInteretKitsRenovation) {
        this.pceRechangeInteretKitsRenovation = pceRechangeInteretKitsRenovation;
    }

    public int getPceRechangeDispoLivraisonPiece() {
        return pceRechangeDispoLivraisonPiece;
    }

    public void setPceRechangeDispoLivraisonPiece(int pceRechangeDispoLivraisonPiece) {
        this.pceRechangeDispoLivraisonPiece = pceRechangeDispoLivraisonPiece;
    }

    public int getConceptEvolErgoFaciliteUtil() {
        return conceptEvolErgoFaciliteUtil;
    }

    public void setConceptEvolErgoFaciliteUtil(int conceptEvolErgoFaciliteUtil) {
        this.conceptEvolErgoFaciliteUtil = conceptEvolErgoFaciliteUtil;
    }

    public int getConceptEvolCorrOffreBesoin() {
        return conceptEvolCorrOffreBesoin;
    }

    public void setConceptEvolCorrOffreBesoin(int conceptEvolCorrOffreBesoin) {
        this.conceptEvolCorrOffreBesoin = conceptEvolCorrOffreBesoin;
    }

    public int getConceptEvolCapaciteInnov() {
        return conceptEvolCapaciteInnov;
    }

    public void setConceptEvolCapaciteInnov(int conceptEvolCapaciteInnov) {
        this.conceptEvolCapaciteInnov = conceptEvolCapaciteInnov;
    }

    public int getConceptEvolDesignProduits() {
        return conceptEvolDesignProduits;
    }

    public void setConceptEvolDesignProduits(int conceptEvolDesignProduits) {
        this.conceptEvolDesignProduits = conceptEvolDesignProduits;
    }

    public int getQualitePrixMatMarche() {
        return qualitePrixMatMarche;
    }

    public void setQualitePrixMatMarche(int qualitePrixMatMarche) {
        this.qualitePrixMatMarche = qualitePrixMatMarche;
    }

    public int getQualitePceRechange() {
        return qualitePceRechange;
    }

    public void setQualitePceRechange(int qualitePceRechange) {
        this.qualitePceRechange = qualitePceRechange;
    }

    public int getPolEnvDemarcheEnv() {
        return polEnvDemarcheEnv;
    }

    public void setPolEnvDemarcheEnv(int polEnvDemarcheEnv) {
        this.polEnvDemarcheEnv = polEnvDemarcheEnv;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
