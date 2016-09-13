import time
import os
import sys
import commands
import datetime
import fnmatch
import subprocess, shlex
import re
import urllib

file_location = os.getcwd()
prop_file = file_location + "\\tmver.properties"
list = []

major = "3"
minor = "1"
rev = "12"
sub = "000"
mcpversion = "7.23"
forgeversion = "6.4.1.411"
mcclientver = "1.4.5"

def cmdsplit(args):
    if os.sep == '\\':
        args = args.replace('\\', '\\\\')
    return shlex.split(args)

def file_exists(filename):
    try:
        with open(filename) as f:
            return True
    except IOError:
        return False
    
def calc():
    global major
    global minor
    global rev
    global sub
    global mcpversion
    global forgeversion
    global mcclientver
    
    major = list[0]
    minor =  list[1]
    rev =  list[2]
    sub = list[3]
    subver = int(sub)
    subver += 1
    sub = str(subver).zfill(3)
    mcpversion = list[4]
    forgeversion = list[5]
    mcclientver = list[6]
    #print mcclientver
        
def read(filename):
    with open(filename,"r") as f:
        lines = f.readlines()        
        for line in lines:
            line = line.strip()
            if not '#' in line:
                split = line.split('=')
                list.append(split[1])
                #print split[1]
        f.close()

def write(filename):
    date = time.asctime(time.localtime(time.time()))
    with open(filename,"w+") as f:
        f.write("# %s \n" %(date))
        f.write("%s=%s\n" %("tm.build.major.number",major))
        f.write("%s=%s\n" %("tm.build.minor.number",minor))
        f.write("%s=%s\n" %("tm.build.revision.number",rev))
        f.write("%s=%s\n" %("tm.build.subversion.number",sub))
        f.write("%s=%s\n" %("tm.build.mcpversion",mcpversion))
        f.write("%s=%s\n" %("tm.build.forgeversion",forgeversion))
        #print mcclientver
        f.write("%s=%s\n" %("tm.build.mcclientversion",mcclientver))
        f.write("%s=%s.%s.%s_%s\n" %("tm.build.build",major, minor, rev, sub))
        f.close()
                
def main():            
    print("[PY]Obtaining version information for mod ")
    if file_exists(prop_file):
        print("[PY]Properties file exists: reading...")
        read(prop_file)
        calc()
        write(prop_file)
    else:
        print("[PY]Properties file does not exists: writting...")
        write(prop_file)
        
    print("[PY]"+time.asctime(time.localtime(time.time())))
    print("[PY]Version information: TrainMod %s.%s.%s_%s using MCP %s and Forge %s for c:%s" % (major, minor, rev, sub, mcpversion, forgeversion, mcclientver))
    
if __name__ == '__main__':
    main()
    