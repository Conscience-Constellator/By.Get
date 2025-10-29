package CC.Util.By.Get;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Point1$1;

public interface Get_Point_By_Point<By_Typ,Valu_Typ> extends
	Get_Q_By_Point<By_Typ>,
	Get_Point_By_Q<Valu_Typ>,
	Point1$1<By_Typ,Valu_Typ>
{
	@Lin_Dclar
	Valu_Typ Get_Point_By_Point(By_Typ By);
		@Override
		@Nevr_Neds_Ovrid
		default Valu_Typ Point1$1(By_Typ In){return Get_Point_By_Point(In);}
}