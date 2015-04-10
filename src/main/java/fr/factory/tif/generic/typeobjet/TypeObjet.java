/*
 =================== DO NOT EDIT THIS FILE ====================
 Generated by Modello 1.3-FRVNS on 2014-10-28 21:59:14,
 any modifications will be overwritten.
 ==============================================================
 */

package fr.factory.tif.generic.typeobjet;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import fr.factory.tif.res.ClassementGuide;
import fr.factory.tif.generic.confort.CategorieConfort;
import fr.factory.tif.generic.geographie.Pays;
import fr.factory.tif.pcu.parcjardin.ThemeParcJardin;
import fr.factory.tif.generic.acces.pointacces.PointAcces;
import fr.factory.tif.pcu.parcjardin.CategorieParcJardin;
import fr.factory.tif.generic.telecom.AccesTelecom;
import fr.factory.tif.vil.VillageVacance;
import fr.factory.tif.ascf.ActiviteSCF;
import fr.factory.tif.generic.tarifs.TypeTarifs;
import fr.factory.tif.org.SubTypeStructure;
import fr.factory.tif.hlo.labelclassement.Theme;
import java.util.Vector;
import fr.factory.tif.hlo.TypeHabitation;
import fr.factory.tif.iti.Itineraire;
import fr.factory.tif.vil.labelclassement.ClassementConfortSanitaire;
import fr.factory.tif.vil.animation.Disponibilite;
import fr.factory.tif.pcu.parcjardin.StyleParcJardin;
import fr.factory.tif.generic.personne.Civilite;
import fr.factory.tif.generic.equipement.Equipement;
import fr.factory.tif.generic.visite.Visite;
import fr.factory.tif.org.Organisme;
import fr.factory.tif.pcu.musee.Musee;
import fr.factory.tif.hlo.DescriptifHabitation;
import fr.factory.tif.generic.temps.Jour;
import java.io.Serializable;
import fr.factory.tif.pcu.sitemonument.SiteMonumentHistorique;
import fr.factory.tif.generic.geographie.Departement;
import fr.factory.tif.generic.service.TypeService;
import fr.factory.tif.generic.geographie.Region;
import fr.factory.tif.vil.SalleReunion;

import fr.factory.tif.application.Utilisateur;
import fr.factory.tif.ota.Prestation;
import fr.factory.tif.generic.labelclassement.Label;
import fr.factory.tif.vil.TypeClient;
import fr.factory.tif.generic.accueil.Accueil;
import fr.factory.tif.vil.Agrement;
import fr.factory.tif.generic.tarifs.Tarifs;
import fr.factory.tif.generic.utils.Langue;
import fr.factory.tif.generic.espace.Espace;
import fr.factory.tif.generic.geographie.Commune;
import fr.factory.tif.pcu.musee.ThemeMusee;
import fr.factory.tif.vil.animation.Animation;
import fr.factory.tif.generic.telecom.TypeTelecom;
import fr.factory.tif.pcu.sitemonument.CategorieSite;
import fr.factory.dao.interfaces.BifaceI18n;
import fr.factory.tif.vil.labelclassement.LabelClassement;
import fr.factory.tif.hlo.SubTypeHabitation;
import fr.factory.tif.iti.TypeThematique;
import fr.factory.tif.generic.tarifs.Charge;
import fr.factory.tif.pcu.PatrimoineCulturel;
import fr.factory.tif.pcu.musee.CategorieMusee;
import fr.factory.tif.generic.espace.TypeDescription;
import fr.factory.tif.generic.capacite.TypeCapacite;
import fr.factory.tif.generic.accueil.Horaire;
import fr.factory.tif.generic.temps.Saison;
import fr.factory.tif.pcu.sitemonument.ThemeSite;
import fr.factory.tif.generic.confort.Confort;
import fr.factory.tif.loi.Loisirs;
import fr.factory.tif.generic.reservation.TypeReservation;
import fr.factory.tif.hlo.HebergementLocatif;
import fr.factory.tif.generic.chaine.Chaine;
import fr.factory.tif.generic.service.Service;
import java.util.*;
import fr.factory.tif.hpa.HotelleriePleinAir;
import fr.factory.tif.generic.confort.TypeConfort;
import fr.factory.tif.deg.StatutExploitant;
import fr.factory.tif.generic.activite.Activite;
import fr.factory.tif.generic.visite.TypeVisite;
import fr.factory.tif.ota.Description;
import fr.factory.tif.generic.geographie.ZoneLocale;
import fr.factory.tif.generic.acces.localacces.TypeLocalAcces;
import fr.factory.tif.generic.labelclassement.Classement;
import java.util.Date;
import fr.factory.tif.generic.utils.Mesure;
import fr.factory.tif.res.DescriptionResto;
import fr.factory.tif.deg.VisiteDegustation;
import fr.factory.tif.pcu.parcjardin.ParcJardin;
import fr.factory.tif.generic.equipement.TypeEquipement;
import fr.factory.tif.generic.geographie.Microregion;
import java.util.Locale;
import fr.factory.tif.res.Specialite;
import fr.factory.tif.loi.TypeLoisirs;
import fr.factory.tif.generic.contact.TypeContact;
import fr.factory.tif.pcu.centre.CentreInterpretation;
import fr.factory.tif.generic.capacite.Capacite;
import java.lang.reflect.Method;
import fr.factory.tif.vil.labelclassement.ClassementEnvironement;
import fr.factory.tif.iti.Thematique;
import fr.factory.tif.vil.TypeGestion;
import fr.factory.tif.fma.ThemeFeteManifestation;
import fr.factory.tif.generic.geographie.Adresse;
import fr.factory.tif.generic.categorie.TypeCategorie;
import fr.factory.tif.generic.personne.Personne;
import fr.factory.tif.pcu.centre.ThemeCentreInterpretation;

import fr.factory.tif.mul.TypeMime;
import fr.factory.tif.generic.temps.PeriodeTemporelle;
import fr.factory.tif.vil.labelclassement.ClassementLoisirService;
import fr.factory.tif.ota.ObjetTouristiqueAbstrait;
import fr.factory.tif.pcu.sitemonument.StyleSite;
import fr.factory.tif.res.Restauration;
import java.util.HashMap;
import fr.factory.tif.generic.acces.localacces.LocalAcces;
import fr.factory.tif.ota.TypeObjetTouristique;
import fr.factory.tif.generic.activite.TypeActivite;
import fr.factory.tif.ascf.SportCultFormule;
import fr.factory.tif.fma.Evenement;
import fr.factory.tif.generic.tarifs.TypeCharge;
import fr.factory.tif.vil.animation.ThemeAnimation;
import fr.factory.tif.mul.TypeMultimedia;
import fr.factory.tif.vil.TypeHebergement;
import fr.factory.tif.generic.contact.Contact;
import fr.factory.tif.pna.PatrimoineNaturel;
import fr.factory.tif.vil.TypeBatiment;
import fr.factory.tif.generic.paiement.TypePaiement;
import fr.factory.tif.generic.reservation.Reservation;

import fr.factory.tif.fma.FeteManifestation;
import fr.factory.tif.generic.espace.TypeEspace;
import fr.factory.tif.generic.groupe.TypeGroupe;
import fr.factory.tif.generic.acces.pointacces.TypePointAcces;
import fr.factory.tif.generic.accueil.OuvertureAccueil;
import fr.factory.dao.interfaces.Biface;
import fr.factory.tif.generic.groupe.Groupe;
import fr.factory.tif.vil.labelclassement.ClassementPrefectoral;
import fr.factory.tif.application.TypeUtilisateur;
import fr.factory.tif.ascf.TypeSportCultFormule;
import fr.factory.tif.generic.geographie.Canton;
import fr.factory.tif.generic.utils.TourHand;
import fr.factory.tif.mul.Multimedia;
import fr.factory.tif.generic.espace.DescriptionEspace;
import fr.factory.tif.hot.Hotellerie;
import fr.factory.tif.ota.TypePrestation;
import fr.factory.tif.ascf.PrestationProposee;
import fr.factory.tif.deg.Degustation;
import fr.factory.tif.org.ClassementOTSI;

/**
 *  
 * 
 * @fdao.class table TYPEOBJET
 * 
 *               static true
 * 
 * @fdao.subclass type fr.factory.tif.generic.utils.BifaceI18n
 * 
 * .
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class TypeObjet
    extends BifaceI18n
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     * 
     * @fdao.property column CODE_ID_
     * 
     *                  size 80
     * 
     * @tif.property  size 80 
     * 
     * .
     */
    private String codeID;

    /**
     *  
     * 
     * @fdao.component class
     * fr.factory.tif.ota.TypeObjetTouristique
     * 
     * .
     */
    private TypeObjetTouristique typeObjetTouristique;

      public TypeObjetTouristique getTypeObjetTouristique() {
  /* {null=TypeObjetTouristique
}*/

		return typeObjetTouristique;
  }

      public void setTypeObjetTouristique(TypeObjetTouristique touristique) {
  /* {null=void
}*/

		typeObjetTouristique= touristique;
  }

      public String getCodeID() {
  /* {null=Returns the codeID.
}*/

        return codeID;
  }

      public void setCodeID(String codeID) {
  /* {param=codeID The codeID to set.
}*/

        this.codeID = codeID;
  }

}
