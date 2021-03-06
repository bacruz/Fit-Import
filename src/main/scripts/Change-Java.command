#!/opt/local/bin/zsh
############################################################ {{{1 ###########
#  Copyright (C) 2007,2008  Martin Krischik
#############################################################################
#  This program is free software: you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation, either version 3 of the License, or
#  (at your option) any later version.
#
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#
#  You should have received a copy of the GNU General Public License
#  along with this program.  If not, see <http://www.gnu.org/licenses/>.
#############################################################################
#  $Author: krischik $
#  $Revision: 6701 $
#  $Date: 2015-01-01 17:21:38 +0100 (Thu, 01 Jan 2015) $
#  $Id: Start-IntelliJ.command 6701 2015-01-01 16:21:38Z krischik $
#  $HeadURL: svn+ssh://krischik@svn.code.sf.net/p/uiq3/code/trunk/Java/src/main/scripts/Start-IntelliJ.command $
############################################################ }}}1 ###########

source ${0:h}/Setup-${HOST}.command

setopt Err_Exit;
setopt XTrace;

pushd "/System/Library/Frameworks/JavaVM.framework/Versions"
    # sudo csrutil disable
    # sudo spctl --master-disable

    # They need to be disabled else one can not change the defalut java
    #
    csrutil status
    spctl --status

    sudo grm --verbose "CurrentJDK"
    sudo gln --verbose --symbolic "/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents" "CurrentJDK"
popd

############################################################ {{{1 ###########
# vim: set wrap tabstop=8 shiftwidth=4 softtabstop=4 noexpandtab :
# vim: set textwidth=0 filetype=zsh foldmethod=marker nospell :
