package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Int;

public interface Get_Int_By_Bool extends
	Get_Q_By_Bool,
	Get_Int_By_Q,
	Bool$Int
{
	@Lin_Dclar int Get_Int_By_Bool(boolean By);
		@Override @Nevr_Neds_Ovrid
		default int Bool$Int(boolean In)
		{return Get_Int_By_Bool(In);}
}