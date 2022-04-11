SELECT  maintable_S941R.groupid,companyname, count(*) as count
 FROM maintable_S941R,cb_vendorinformation where maintable_S941R.groupid=cb_vendorinformation.groupid group by
maintable_S941R.groupid,companyname order by count, maintable_S941R.groupid;