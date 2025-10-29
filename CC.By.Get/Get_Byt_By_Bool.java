package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Byt;

public interface Get_Byt_By_Bool extends
	Get_Q_By_Bool,
	Get_Byt_By_Q,
	Bool$Byt
{
	@Lin_Dclar
	byte Get_Byt_By_Bool(boolean By);
		@Override @Nevr_Neds_Ovrid
		default byte Bool$Byt(boolean By)
		{return Get_Byt_By_Bool(By);}
}