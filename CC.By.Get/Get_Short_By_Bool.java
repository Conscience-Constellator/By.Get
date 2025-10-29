package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Short;

public interface Get_Short_By_Bool extends
	Get_Q_By_Bool,
	Get_Short_By_Q,
	Bool$Short
{
	@Lin_Dclar short Get_Short_By_Bool(boolean By);
		@Override
		@Nevr_Neds_Ovrid
		default short Bool$Short(boolean In){return Get_Short_By_Bool(In);}
}